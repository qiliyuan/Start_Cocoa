package com.qly.cocoa.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/blog")
@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home(){
		
		
		System.out.println(">>home");
		return "/blog/index";
	}
}
