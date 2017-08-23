package org.eop.spring.mvc.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.eop.spring.mvc.mybatis.service.PostService;
import org.eop.spring.mvc.mybatis.service.TagService;
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
@RequestMapping("/")
@Controller
public class HomeController {

	@Autowired
	private PostService postService;
	
	@Autowired
	private TagService tagService;
	
	@GetMapping
	public String home(Model model) {
		//返回所有文章，所有标签
		List<Map<String, Object>> postVOs = postService.listPostVOsForHome();
		
		List<Map<String, Object>> tagVOs = tagService.listTagVOsForHome();
		
		
		return "";
	}
	
	@GetMapping("/t/{name}")
	public String tag(@PathVariable("name") String name) {
		List<Map<String, Object>> postVOs = postService.listPostVOsByTagNameForHome(name);
		
		return "";
	}
}
