package org.eop.spring.mvc.mybatis.controller;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;
import org.eop.spring.mvc.mybatis.bean.Tag;
import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.service.BlogService;
import org.eop.spring.mvc.mybatis.service.TagService;
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
@RequestMapping("/tag")
@Controller
public class TagController {

	@Autowired
	private TagService tagService;
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/add")
	public String addTag(Model model) {
		model.addAttribute("tag", new Tag());
		return "tag/add";
	}
	
	@PostMapping("/add")
	public String addTag(Tag tag, BindingResult bresult, @SessionAttribute("user") User user) {
		Blog blog = blogService.getBlogByUser(user.getId());
		tag.setBlogId(blog.getId());
		tagService.saveTag(tag);
		return "redirect:/tag/list";
	}
	
	@GetMapping("/list")
	public String listTag(Model model, @SessionAttribute("user") User user) {
		Blog blog = blogService.getBlogByUser(user.getId());
		List<Tag> tags = tagService.listTagsByBlog(blog.getId());
		model.addAttribute("tags", tags);
		return "tag/list";
	}
	
	@GetMapping("/edit/{id:\\d+}")
	public String editTag(@PathVariable("id")Long id, Model model) {
		Tag tag = tagService.getTag(id);
		model.addAttribute("tag", tag);
		return "tag/edit";
	}
	
	@PostMapping("/edit")
	public String editTag(Tag tag, BindingResult bresult) {
		tagService.updateTag(tag);
		return "redirect:/tag/list";
	}
	
	@GetMapping("/delete/{id:\\d+}")
	public String deleteTag(@PathVariable("id")Long id) {
		tagService.removeTag(id);
		return "redirect:/tag/list";
	}
	
}
