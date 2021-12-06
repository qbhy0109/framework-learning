package com.yb.controller;

import com.yb.service.BlogService;
import com.yb.querytype.*;
import com.yb.pojo.User;
import com.yb.pojo.Blog;

import java.lang.Integer;
import java.util.Date;
import java.util.List;

//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@Controller
public class IndexController {
	
	@Autowired
	private BlogService blogService;

	@GetMapping({"/", "index", "index.html"})
	public String index(Model model) {
		List<Blog> allBlog = blogService.getAllBlog();
		if(allBlog!=null) {
			model.addAttribute("allBlog", allBlog);
		}
		return "index";
	}
}














