package com.yb.controller;

import com.yb.pojo.Blog;
import com.yb.pojo.User;
import com.yb.service.BlogService;
import com.yb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class BlogController {

    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/createBlog")
    public String getCreate(HttpSession session, Model model){
        String user = (String)session.getAttribute("username");
        if(user == null){
            return "redirect:signIn";
        }
        model.addAttribute("user", user);
        return "createBlog";
    }

    @PostMapping("/createBlog")
    public String createBlog(@RequestParam("title") String title, @RequestParam("context") String context,
                             Model model, HttpSession session){
//		System.out.println(title+": "+context);
        String author = (String)session.getAttribute("username");
        System.out.println("user:"+author);
        if(author==null) {
            return "redirect:signIn";
        }
        Blog blog = new Blog();
        blog.setAuthor(author);
        blog.setTitle(title);
        blog.setContext(context);
        blogService.createBlog(blog);
//        model.addAttribute("blog", blog);
        return "redirect:index";
//		return "blogDetail";
    }

    @GetMapping("/detailBlog/{articleId}")
    public String getBlogDetail(@PathVariable("articleId") Long id, Model model, HttpSession session){
        Blog article = blogService.getBlogById(id);
        if(article==null){
            // return 404...
            return "redirect:index";
        }
        article.setViews(article.getViews()+1);
        System.out.println(article.getViews());
        blogService.viewsAdd(id);
        // 此处用IndexBlog类型不好，包含全部信息，应该设计一个title，context等必要信息的类型
        model.addAttribute("article", article);
        model.addAttribute("user", session.getAttribute("username"));
        return "detailBlog";
    }

    @GetMapping("/deleteBlog/{articleId}")
    public String deleteBlog(@PathVariable("articleId") Long id, Model model, HttpSession session){
        String user = (String)session.getAttribute("username");
        Blog blog = blogService.getBlogById(id);
        if(blog!=null&&user!=null&&user.equals(blog.getAuthor())){
            blogService.deleteBlogById(id);
            System.out.println("Yes:"+user+"  "+blog.getAuthor());
            return "redirect:/index";
            // "redirect:/index"回到templates/index     "redirect:index"回到templates/deleteBlog/index ....出错
        }
        System.out.println("no:"+user+"  "+blog.getAuthor()+":"+"redirect:/detailBlog/"+id);
        return "redirect:/detailBlog/"+id;
    }

    @GetMapping("/modifyBlog/{articleId}")
    public String getModify(@PathVariable("articleId") Long id){
        return "modifyBlog";
    }

    @PostMapping("modifyBlog/{articleId}")
    public String postModify(@PathVariable("articleId") Long id, @RequestParam("title") String title,
                             @RequestParam("context") String context, HttpSession session, Model model){
        String user = (String)session.getAttribute("username");
        Blog article = blogService.getBlogById(id);
        if(article!=null&&user!=null&&user.equals(article.getAuthor())){
            article.setTitle(title);
            article.setContext(context);
            blogService.saveBlog(article);
            model.addAttribute("article", article);
        }
        return "/detailBlog/"+id;
    }
}
