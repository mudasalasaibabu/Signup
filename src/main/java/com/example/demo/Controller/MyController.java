package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entity.UserRegistration;
import com.example.demo.Service.UserService;

@Controller
public class MyController {
	@Autowired
	UserService userService;
	@GetMapping("/")
	public String home() {
	    return "redirect:/form";
	}
	@GetMapping("/form")
public String showForm() {
	return "register";
}@PostMapping("/register")
	public String register(@ModelAttribute UserRegistration user) {
		userService.save(user);
		return "Success";
	}
}
