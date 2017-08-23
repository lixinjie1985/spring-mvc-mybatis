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
	
	@GetMapping("/")
	public String home(@PathVariable("path") String path) {
		//返回个人文章，个人标签，个人评论
		Blog blog = blogService.getBlogByPath(path);
		User user = userService.getUser(blog.getUserId());
		List<Post> posts = postService.listPostsByBlog(blog.getId());
		List<Tag> tags = tagService.listTagsByBlog(blog.getId());
		List<Comment> comments = commentService.listCommentsByBlog(blog.getId());
		
		return "";
	}
	
	@GetMapping("/p/{id}")
	public String post(@PathVariable("path") String path, @PathVariable("id") Long id) {
		Blog blog = blogService.getBlogByPath(path);
		User user = userService.getUser(blog.getUserId());
		Post post = postService.getPost(id);
		List<Comment> comments = commentService.listCommentsByPost(post.getId());
		
		return "";
	}
	
	@GetMapping("/t/{id}")
	public String tag(@PathVariable("path") String path, @PathVariable("id") Long id) {
		Blog blog = blogService.getBlogByPath(path);
		User user = userService.getUser(blog.getUserId());
		Tag tag = tagService.getTag(id);
		List<Post> posts = postService.listPostsByTag(tag.getId());
		
		return "";
	}
}
