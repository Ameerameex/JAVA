package com.training.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="/hello")
public class HelloWorld {

	@GET  
	@Produces(MediaType.TEXT_XML)  
	@Path("/say1/{name}")
	public String sayHello1(@PathParam("name")String name){
		
		
		return "<?xml version='1.0' encoding='UTF-8'?>"+"<greeting> "+name.toUpperCase()+"</greeting> ";
	} 
	@GET  
	@Produces(MediaType.TEXT_HTML)  
	@Path("/say2/{name}")
	public String sayHello2(@PathParam("name")String name){
		
		
		return "<h1> "+name.toUpperCase()+"</h1> ";
	} 
	@GET  
	@Produces(MediaType.TEXT_PLAIN)  
	@Path("/say3/{name}")
	public String sayHello3(@PathParam("name")String name){
		
		
		return "Hello "+name.toUpperCase();
	} 
	
	
}
