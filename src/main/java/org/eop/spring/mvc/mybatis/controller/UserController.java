package org.eop.spring.mvc.mybatis.controller;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/add")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "user/add";
	}
	
	@PostMapping("/add")
	public String addUser(User user, BindingResult bresult) {
		user.setStatus(1);
		userService.saveUser(user);
		return "redirect:/user/list";
	}
	
	@GetMapping("/list")
	public String listUser(Model model) {
		List<User> users = userService.listAllUsers();
		model.addAttribute("users", users);
		return "user/list";
	}
	
	@GetMapping("/edit/{id:\\d+}")
	public String editUser(@PathVariable("id")Long id, Model model) {
		User user = userService.getUser(id);
		model.addAttribute("user", user);
		return "user/edit";
	}
	
	@PostMapping("/edit")
	public String editUser(User user, BindingResult bresult) {
		userService.updateUser(user);
		return "redirect:/user/list";
	}
	
	@GetMapping("/delete/{id:\\d+}")
	public String deleteUser(@PathVariable("id")Long id) {
		userService.removeUser(id);
		return "redirect:/user/list";
	}
}
