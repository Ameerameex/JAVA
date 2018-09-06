package com.training.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.business.TicketBooking;

@Controller
public class TicketingController {

	@RequestMapping("/newTicket")

	public String getNewBooking(Model model){
		
		TicketBooking booking=new TicketBooking();
		model.addAttribute("bt",booking);
		
		
		return "BookingInput";
	}
	@RequestMapping(value="/addTicket",method = RequestMethod.POST)
	public ModelAndView addTicketBooking(@ModelAttribute(value="bt") TicketBooking booking,ModelMap modelMap){
		System.out.println("\n\n\t\t [ "+booking+" received in controller add ticket");
		ModelAndView modelAndView=new ModelAndView("BookingOutput");
		modelAndView.addObject("booking", booking);
		modelMap.put("message", "Successfully Added");
		return modelAndView;
		
	}
	@RequestMapping(value="/removeTicket/{id}/{name}")
	public String deleteTicket(@PathVariable(value="id") int id,@PathVariable(value="name")String passengerName,Model model){
		System.out.println(id);
		System.out.println(passengerName);
		model.addAttribute("message","Deleted Successfully");
		
		return "status";
	}
	
}
