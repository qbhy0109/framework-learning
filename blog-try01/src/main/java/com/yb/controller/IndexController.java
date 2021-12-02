package com.yb.controller;

import com.yb.service.BlogService;
import com.yb.querytype.*;
import com.yb.pojo.User;

import java.lang.Integer;
import java.util.Date;
import java.util.List;

//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@Controller
public class IndexController {
	
	@Autowired
	private BlogService blogService;

	@Autowired
	private UserService userService;
	
	@GetMapping({"/", "index", "index.html"})
	public String index(Model model) {
//			, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
//		PageHelper.startPage(pageNum, 10);
		List<IndexBlog> allBlog = blogService.getAllBlog();
		
		if(allBlog!=null) {
			model.addAttribute("allBlog", allBlog);
//			String[] keys = indexBlog.
//			IndexBlog testBlog = allBlog.get(1);
//			session.setAttribute("testBlog",testBlog);
		}
		
//		IndexBlog testBlog = blogService.getBlogById(Long.valueOf(2));
//		model.addAttribute("testBlog", testBlog);
//		System.out.println(testBlog.getTitle());
		
//		PageInfo<IndexBlog> pageInfo = new PageInfo<>(indexBlog);
//		model.addAttribute("pageInfo", pageInfo);
		return "index";
	}
	
	
//	@PostMapping("/")
//	public String login(User user, Model model) {
//		
//		
//		return "";
//	}
	
	@PostMapping("/signin")
	public String signin(@RequestParam("username") String username, @RequestParam("password") String password,
						HttpSession session, Model model) {
		int count = userService.checkUser(username);
		if(count==0){
//			User user = new User();
//			user.setUserName(username);
//			user.setPassword(password);
			User user = new User(Long.valueOf(10), "u","p","n","e","i",new Date(),new Date());
			userService.newUser(user);
			System.out.println("add user success!");
			model.addAttribute("user", user);
			session.setAttribute("user", user);
		}else if(count==1){
			System.out.println("user is exist!");
		}
		return "test";

	}

//	@PostMapping("signin")
//	public String signin()
	
}














