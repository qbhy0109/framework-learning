package com.yb.controller;

import com.yb.service.BlogService;
import com.yb.querytype.*;

import java.lang.Integer;
import java.util.List;

//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
//import org.springframework


@Controller
public class IndexController {
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping({"/", "index", "index.html"})
	public String index(Model model) {
//			, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
//		PageHelper.startPage(pageNum, 10);
		List<IndexBlog> indexBlog = blogService.getAllBlog();
		
		if(indexBlog!=null) {
//			String[] keys = indexBlog.
			IndexBlog testBlog = indexBlog.get(1);
			model.addAttribute("testBlog", testBlog);
			System.out.println(testBlog.getUser());
		}
		
//		IndexBlog testBlog = blogService.getBlogById(Long.valueOf(2));
//		model.addAttribute("testBlog", testBlog);
//		System.out.println(testBlog.getTitle());
		
//		PageInfo<IndexBlog> pageInfo = new PageInfo<>(indexBlog);
//		model.addAttribute("pageInfo", pageInfo);
		return "index";
	}
	
	
}














