package org.eop.spring.mvc.mybatis.controller;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;
import org.eop.spring.mvc.mybatis.bean.Comment;
import org.eop.spring.mvc.mybatis.bean.Post;
import org.eop.spring.mvc.mybatis.bean.Tag;
import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.service.BlogService;
import org.eop.spring.mvc.mybatis.service.CommentService;
import org.eop.spring.mvc.mybatis.service.PostService;
import org.eop.spring.mvc.mybatis.service.TagService;
import org.eop.spring.mvc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
@RequestMapping("/{path}")
@Controller
public class HomePersonController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private TagService tagService;
	
	@Autowired
	private CommentService commentService;
	
	@GetMapping
	public String home(@PathVariable("path") String path, Model model) {
		//返回个人文章，个人标签，个人评论
		Blog blog = blogService.getBlogByPath(path);
		model.addAttribute("blog", blog);
		User user = userService.getUser(blog.getUserId());
		model.addAttribute("user", user);
		List<Post> posts = postService.listPostsByBlog(blog.getId());
		model.addAttribute("posts", posts);
		List<Tag> tags = tagService.listTagsByBlog(blog.getId());
		model.addAttribute("tags", tags);
		List<Comment> comments = commentService.listCommentsByBlog(blog.getId());
		model.addAttribute("comments", comments);
		return "person/home";
	}
	
	@GetMapping("/p/{id}")
	public String post(@PathVariable("path") String path, @PathVariable("id") Long id, Model model) {
		Blog blog = blogService.getBlogByPath(path);
		model.addAttribute("blog", blog);
		User user = userService.getUser(blog.getUserId());
		model.addAttribute("user", user);
		Post post = postService.getPost(id);
		model.addAttribute("post", post);
		List<Tag> tags = tagService.listTagsByPost(post.getId());
		model.addAttribute("tags", tags);
		List<Comment> comments = commentService.listCommentsByPost(post.getId());
		model.addAttribute("comments", comments);
		return "person/post";
	}
	
	@GetMapping("/t/{id}")
	public String tag(@PathVariable("path") String path, @PathVariable("id") Long id, Model model) {
		Blog blog = blogService.getBlogByPath(path);
		model.addAttribute("blog", blog);
		User user = userService.getUser(blog.getUserId());
		model.addAttribute("user", user);
		Tag tag = tagService.getTag(id);
		model.addAttribute("tag", tag);
		List<Post> posts = postService.listPostsByTag(tag.getId());
		model.addAttribute("posts", posts);
		return "person/tag";
	}
}
