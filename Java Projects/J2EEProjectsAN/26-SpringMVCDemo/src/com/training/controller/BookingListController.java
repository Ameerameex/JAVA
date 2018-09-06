package com.training.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.training.business.TicketBooking;

public class BookingListController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView modelAndView=new ModelAndView("BookingList");
		List<TicketBooking> bookings=new ArrayList<>();
		TicketBooking ticketBooking=new TicketBooking(6061, "Dhoni", new Date(), new Date(), "Rahath Travels", "Chennai", "Tuticorin", 700.00);
		TicketBooking ticketBooking2=new TicketBooking(6062, "Raina", new Date(), new Date(), "Rahath Travels", "Chennai", "Tuticorin", 700.00);
		TicketBooking ticketBooking3=new TicketBooking(6063, "Watson", new Date(), new Date(), "Rahath Travels", "Chennai", "Tuticorin", 700.00);
		TicketBooking ticketBooking4=new TicketBooking(6064, "Faf", new Date(), new Date(), "Rahath Travels", "Chennai", "Tuticorin", 700.00);
		TicketBooking ticketBooking5=new TicketBooking(6065, "Ambati", new Date(), new Date(), "Rahath Travels", "Chennai", "Tuticorin", 700.00);

		bookings.add(ticketBooking);
		bookings.add(ticketBooking2);
		bookings.add(ticketBooking3);
		bookings.add(ticketBooking4);
		bookings.add(ticketBooking5);

		modelAndView.addObject("bookings", bookings);
		return modelAndView;
	}

}
