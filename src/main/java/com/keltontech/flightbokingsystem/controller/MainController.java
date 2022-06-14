package com.keltontech.flightbokingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.keltontech.flightbokingsystem.entities.User;
import com.keltontech.flightbokingsystem.services.iUserService;

@Controller
public class MainController {
	@Autowired
	private iUserService usrService;
	@GetMapping("/")
	public String welcomepage() {
		return "welcome";
	}
	
	@GetMapping("/login")
	public String loginpage() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String signuppage() {
		return "signup";
	}
	
	@GetMapping("/booking")
	public String bookingpage() {
		return "booking";
	}
	
	@PostMapping("/user/new")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		usrService.saveUser(user);
		return "success";
	}


}
