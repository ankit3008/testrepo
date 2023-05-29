package com.unibrain.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController{

	@RequestMapping("/")
	public ModelAndView Hello(HttpServletRequest req)
	{		
		System.err.println("Application Started...!");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
		
	}
}