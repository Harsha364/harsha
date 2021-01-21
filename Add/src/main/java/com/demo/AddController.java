

package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/login")
	public ModelAndView add(@RequestParam("uname") String s1,@RequestParam("pass") String s2,HttpServletRequest request,HttpServletResponse response) {

	//	int i=Integer.parseInt(request.getParameter("n1"));
	//	int j=Integer.parseInt(request.getParameter("n2"));
		
//		int k=i+j;  // logic in AddService
		
		AddService as=new AddService();
		int k=as.login(s1,s2);
		ModelAndView mv=new ModelAndView();
		if(k==0) {
		
		mv.setViewName("display");
		mv.addObject("result",k);
		System.out.println(" ");
		}
		else {
		
		mv.setViewName("error");
		mv.addObject("result",k);
		}
		
		
			return mv;
	}

}

