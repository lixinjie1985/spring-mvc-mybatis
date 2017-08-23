package org.eop.spring.mvc.mybatis.controller;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;
import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
@RequestMapping("/blog")
@Controller
public class BlogController {
	
	@Autowired
	private BlogService blogService;

	@GetMapping("/add")
	public String addBlog(Model model) {
		model.addAttribute("blog", new Blog());
		return "blog/add";
	}
	
	@PostMapping("/add")
	public String addBlog(Blog blog, BindingResult bresult, @SessionAttribute("user") User user) {
		blog.setUserId(user.getId());
		blogService.saveBlog(blog);
		return "redirect:/blog/list";
	}
	
	@GetMapping("/list")
	public String listBlog(Model model) {
		List<Blog> blogs = blogService.listAllBlogs();
		model.addAttribute("blogs", blogs);
		return "blog/list";
	}
	
	@GetMapping("/edit/{id:\\d+}")
	public String editBlog(@PathVariable("id")Long id, Model model) {
		Blog blog = blogService.getBlog(id);
		model.addAttribute("blog", blog);
		return "blog/edit";
	}
	
	@PostMapping("/edit")
	public String editBlog(Blog blog, BindingResult bresult) {
		blogService.updateBlog(blog);
		return "redirect:/blog/list";
	}
	
	@GetMapping("/delete/{id:\\d+}")
	public String deleteBlog(@PathVariable("id")Long id) {
		blogService.removeBlog(id);
		return "redirect:/blog/list";
	}
}
