package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "こちらはspringTestアプリケーションです。");
		return "index";
	}
	
}
