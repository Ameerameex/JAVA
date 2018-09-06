package com.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ExitController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("exit");
		modelAndView.addObject("message","Thanks for using Spring 4.0 MVC");
		
		
		return modelAndView;
	}

}
