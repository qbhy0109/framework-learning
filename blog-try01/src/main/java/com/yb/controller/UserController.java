package com.yb.controller;

import com.yb.pojo.User;
import com.yb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signOut")
    public String signOut(HttpSession session){
        session.removeAttribute("username");
        return "redirect:index";
    }


    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(@RequestParam("username") String username, @RequestParam("password") String password,
                               HttpSession session, Model model){
//		User u = userService.getUserByName(username);
//		if(u==null){
        if(userService.getUserByName(username)==null){
            User user = new User();
            user.setUserName(username);
            user.setPassword(password);
            userService.newUser(user);
            session.setAttribute("username", username);
            model.addAttribute("user", username);
            System.out.println("add user success!");
//            return "index";
            return "redirect:index";
        }
        // print: the user exists
        return "redirect:register";
    }


    @GetMapping("/signIn")
    public String getSignIn(){
        return "signIn";
    }

    @PostMapping("/signIn")
    public String signIn(@RequestParam("username") String username, @RequestParam("password") String password,
                         HttpSession session, Model model) {
        System.out.println("signing in...");
        User user = userService.getUserByName(username);
        String pwd = user.getPassword();
//		System.out.println(pwd);
        System.out.println(password);
        if(pwd.equals(password)){
            session.setAttribute("username", username);
            model.addAttribute("user", username);
//            return "index";
            return "redirect:index";
        }
        System.out.println("failed...");
        return "redirect:signIn";
    }
}
