package org.eop.spring.mvc.mybatis.controller;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;
import org.eop.spring.mvc.mybatis.bean.Comment;
import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.service.BlogService;
import org.eop.spring.mvc.mybatis.service.CommentService;
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
 * @since 2017-08-20
 */
@RequestMapping("/comment")
@Controller
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/add")
	public String addComment(Model model) {
		model.addAttribute("comment", new Comment());
		return "comment/add";
	}
	
	@PostMapping("/add")
	public String addComment(Comment comment, BindingResult bresult, @SessionAttribute("user") User user) {
		Blog blog = blogService.getBlogByUser(user.getId());
		comment.setBlogId(blog.getId());
		commentService.saveComment(comment);
		return "redirect:/comment/list";
	}
	
	@GetMapping("/list")
	public String listComment(Model model, @SessionAttribute("user") User user) {
		Blog blog = blogService.getBlogByUser(user.getId());
		List<Comment> comments = commentService.listCommentsByBlog(blog.getId());
		model.addAttribute("comments", comments);
		return "comment/list";
	}
	
	@GetMapping("/edit/{id:\\d+}")
	public String editComment(@PathVariable("id")Long id, Model model) {
		Comment comment = commentService.getComment(id);
		model.addAttribute("comment", comment);
		return "comment/edit";
	}
	
	@PostMapping("/edit")
	public String editComment(Comment comment, BindingResult bresult) {
		commentService.updateComment(comment);
		return "redirect:/comment/list";
	}
	
	@GetMapping("/delete/{id:\\d+}")
	public String deleteComment(@PathVariable("id")Long id) {
		commentService.removeComment(id);
		return "redirect:/comment/list";
	}
}
