package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	

	@GetMapping("/hello")
	public ModelAndView sayHello() {
		String msg="welcome to My First Spring MVC Application";
		return new ModelAndView("hellomsg","mymsg",msg);
		
	}
	
	 @GetMapping("/welcome")
		public String sayWelcome(Model ob) {
			ob.addAttribute("message", "Hello From Spring MVC");
			ob.addAttribute("name", "IET students");
			return "welcome";
			
		}

}
