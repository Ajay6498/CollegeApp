package com.java.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 

@Controller
@RequestMapping("/wellcomecontorller")
public class WellcomeController {
@GetMapping("/wellcome")
public String wellcome() {
	 
	return "wellcome";
}

@GetMapping("/home")
public String Home() {
	 
	return "home";
}
}
