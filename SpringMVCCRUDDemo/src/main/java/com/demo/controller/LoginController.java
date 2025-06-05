package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.MyUser;
import com.demo.service.LoginService;

@Controller
public class LoginController {


	@Autowired
	LoginService lservice;
	
	@GetMapping("/mylogin")
	public String showLoginpage() {
		return "loginpage";
		
	}
	
	@PostMapping("/validateuser")
	public ModelAndView validateUser(@RequestParam String uname,@RequestParam String pass) {
		MyUser u=lservice.validateUser(uname,pass);
		String msg=null;
		if(u!=null) {
			 msg="valid user";
//			 System.out.println("user validated");
//			 return new ModelAndView("loginpage","msg",msg);
			 
			 return new ModelAndView("redirect:/product/viewproducts");
			
		}else {
			 msg="Wrong credentials, pls reenter";
			 return new ModelAndView("loginpage","msg",msg);
			 
		}
		//return new ModelAndView("success","msg",msg);
		
	}
}
