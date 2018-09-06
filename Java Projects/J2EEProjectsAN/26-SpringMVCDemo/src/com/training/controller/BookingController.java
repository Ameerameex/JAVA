package com.training.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.training.business.TicketBooking;

public class BookingController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView modelAndView=new ModelAndView("BookingOutput");
		TicketBooking ticketBooking=new TicketBooking(6061, "Dhoni", new Date(), new Date(), "Rahath Travels", "Chennai", "Tuticorin", 700.00);
		modelAndView.addObject("booking", ticketBooking);
		
		return modelAndView;
	}

}
