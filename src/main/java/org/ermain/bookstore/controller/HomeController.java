package org.ermain.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController{
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("greeting", "Welcome to the Bookstore");
		model.addAttribute("tagline", "The one and only Bookstore");
		
		return "index";
	}
}
