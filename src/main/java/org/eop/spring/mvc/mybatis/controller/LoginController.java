package org.eop.spring.mvc.mybatis.controller;

import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
@RequestMapping("/login")
@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public String login() {
		return "login/login";
	}
	
	@PostMapping
	public String login(WebRequest request, @RequestParam("userName") String userName, @RequestParam("password") String password) {
		User user = userService.getUserByLogin(userName, password);
		request.setAttribute("user", user, WebRequest.SCOPE_SESSION);
		return "redirect:/blog/add";
	}
}
