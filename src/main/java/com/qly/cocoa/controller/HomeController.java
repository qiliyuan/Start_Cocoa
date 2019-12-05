package com.qly.cocoa.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/blog")
@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home(){
		System.out.println(">>home");
		System.out.println("修改测试controller");

		System.out.println("修改测试controller");

		System.out.println("修改测试controller");
		return "/blog/index";
	}
}
