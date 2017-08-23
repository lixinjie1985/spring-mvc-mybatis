package org.eop.spring.mvc.mybatis.controller;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;
import org.eop.spring.mvc.mybatis.bean.Post;
import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.service.BlogService;
import org.eop.spring.mvc.mybatis.service.PostService;
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
@RequestMapping("/post")
@Controller
public class PostController {

	@Autowired
	private PostService postService;
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/add")
	public String addPost(Model model) {
		model.addAttribute("post", new Post());
		return "post/add";
	}
	
	@PostMapping("/add")
	public String addPost(Post post, BindingResult bresult, @SessionAttribute("user") User user) {
		Blog blog = blogService.getBlogByUser(user.getId());
		post.setBlogId(blog.getId());
		postService.savePost(post);
		return "redirect:/post/list";
	}
	
	@GetMapping("/list")
	public String listPost(Model model, @SessionAttribute("user") User user) {
		Blog blog = blogService.getBlogByUser(user.getId());
		List<Post> posts = postService.listPostsByBlog(blog.getId());
		model.addAttribute("posts", posts);
		return "post/list";
	}
	
	@GetMapping("/edit/{id:\\d+}")
	public String editPost(@PathVariable("id")Long id, Model model) {
		Post post = postService.getPost(id);
		model.addAttribute("post", post);
		return "post/edit";
	}
	
	@PostMapping("/edit")
	public String editPost(Post post, BindingResult bresult) {
		postService.updatePost(post);
		return "redirect:/post/list";
	}
	
	@GetMapping("/delete/{id:\\d+}")
	public String deletePost(@PathVariable("id")Long id) {
		postService.removePost(id);
		return "redirect:/post/list";
	}
}
