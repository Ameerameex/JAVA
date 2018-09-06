package com.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.training.business.TicketBooking;

public class NewBookingController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView modelAndView=new ModelAndView("BookingInput");
		TicketBooking ticketBooking=new TicketBooking();
		modelAndView.addObject("command",ticketBooking);
		return modelAndView;
	}

}
