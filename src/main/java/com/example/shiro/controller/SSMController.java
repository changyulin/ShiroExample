package com.example.shiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.shiro.service.UserService;

@Controller
public class SSMController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/user" }, method = { RequestMethod.GET })
	public String doGet(Model model) {
		model.addAttribute("msg", "Hello, " + userService.getUserById(1).getUsername());
		return "ssm";
	}

}
