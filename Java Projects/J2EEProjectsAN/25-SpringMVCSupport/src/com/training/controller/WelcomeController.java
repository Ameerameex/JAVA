package com.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView modelAndView=null;
		modelAndView=new ModelAndView();
		modelAndView.setViewName("welcome");
		modelAndView.addObject("message","Welcome to Spring 4.0 MVC");
		return modelAndView;
	}

	
}
