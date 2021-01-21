package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.model.Login;
import com.service.LoginService;


@Controller
public class LoginController {
	@Autowired
	public LoginService loginservice;
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView page(@RequestParam("uname") String s1,@RequestParam("pass") String s2,HttpServletRequest request,HttpServletResponse response) {

		loginservice.validateUser(null);
		
	
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("login",new Login());
		return mv;
	
		
			
	}

}

