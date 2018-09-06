package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Guest;
import com.training.business.HotelRoom;


public class HotelRoomStatusDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HotelRoom hotelRoom1=new HotelRoom("G-1", "I", 1, false, null);
		HotelRoom hotelRoom2=new HotelRoom("G-2", "I", 1, false, null);
		HotelRoom hotelRoom3=new HotelRoom("G-3", "I", 1, false, null);
		HotelRoom hotelRoom4=new HotelRoom("G-4", "I", 1, false, null);
		HotelRoom hotelRoom5=new HotelRoom("G-5", "I", 1, false, null);
		
		HotelRoom hotelRoom6=new HotelRoom("F-6", "II", 2, false, null);
		HotelRoom hotelRoom7=new HotelRoom("F-7", "II", 2, false, null);
		HotelRoom hotelRoom8=new HotelRoom("F-8", "II", 2, false, null);
		HotelRoom hotelRoom9=new HotelRoom("F-9", "II", 2, false, null);
		HotelRoom hotelRoom10=new HotelRoom("F-10","II", 2, false, null);
		
		HotelRoom hotelRoom11=new HotelRoom("S-11", "III", 3, false, null);
		HotelRoom hotelRoom12=new HotelRoom("S-12", "III", 3, false, null);
		HotelRoom hotelRoom13=new HotelRoom("S-13", "III", 3, false, null);
		HotelRoom hotelRoom14=new HotelRoom("S-14", "III", 3, false, null);
		HotelRoom hotelRoom15=new HotelRoom("S-15", "III", 3, false, null);


		Guest guest1=new Guest("JayaBalaji", 22);
		hotelRoom1.setOccupied(true);
		hotelRoom1.setGuest(guest1);
		
		Guest guest2=new Guest("Madhan", 22);
		hotelRoom2.setOccupied(true);
		hotelRoom2.setGuest(guest2);
		
		List<HotelRoom> hotelRooms=new ArrayList<>();
		hotelRooms.add(hotelRoom1);
		hotelRooms.add(hotelRoom2);
		hotelRooms.add(hotelRoom3);
		hotelRooms.add(hotelRoom4);
		hotelRooms.add(hotelRoom5);
		hotelRooms.add(hotelRoom6);
		hotelRooms.add(hotelRoom7);
		hotelRooms.add(hotelRoom8);
		hotelRooms.add(hotelRoom9);
		hotelRooms.add(hotelRoom10);
		hotelRooms.add(hotelRoom11);
		hotelRooms.add(hotelRoom12);
		hotelRooms.add(hotelRoom13);
		hotelRooms.add(hotelRoom14);
		hotelRooms.add(hotelRoom15);


		
	       PrintWriter out=response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Demo </title>");
			String cssFileLocation="Styles/Style5.css";
			String linkStr="<link href='"+ cssFileLocation +"' " +"rel='" + "stylesheet"+ "'>";
			out.println(linkStr);
			out.println("</head>");

			out.println("<body>");
			out.println("<table>");
			
			out.println("<tr>");
			out.println("<th>ROOM NO</th>");
			out.println("<th>FLOOR NO</th>");
			out.println("<th>ROOM TYPE</th>");
			out.println("<th>OCCUPIED</th>");
			out.println("<th>GUEST DATA</th>");
			out.println("</tr>");
			
			for (HotelRoom hotelRoom : hotelRooms) {
				
				out.println("<tr>");
				
				out.println("<td>");
				out.println(hotelRoom.getRoomNo());
				out.println("</td>");
				
				out.println("<td>");
				out.println(hotelRoom.getFloorNo());
				out.println("</td>");
				
				if(hotelRoom.getRoomType()==1){
					out.println("<td>");
					out.println("DELUXE");
					out.println("</td>");
				}
				else if(hotelRoom.getRoomType()==2){
					out.println("<td>");
					out.println("ULTRA DELUXE");
					out.println("</td>");
				}
				else{
					out.println("<td>");
					out.println("SUPERIOR");
					out.println("</td>");
				}
				
				out.println("<td>");
				out.println(hotelRoom.isOccupied());
				out.println("</td>");
				
				if(hotelRoom.isOccupied()==true){
				out.println("<td>");
				out.println(hotelRoom.getGuest().getName()+" ,");
				out.println(hotelRoom.getGuest().getAge());
				out.println("</td>");
				}
				else{
					
					out.println("<td>");
					out.println("-");
					out.println("</td>");
				}
				
				out.println("</tr>");

				
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
