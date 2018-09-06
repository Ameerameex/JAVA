package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Guest;
import com.training.business.HotelRoom;

public class HotelRoomStatusEditServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelRoom room1 = new HotelRoom("G-1", "I", 1, false, null);
		HotelRoom room2 = new HotelRoom("G-2", "I", 1, false, null);
		HotelRoom room3 = new HotelRoom("G-3", "I", 1, false, null);
		HotelRoom room4 = new HotelRoom("G-4", "I", 1, false, null);
		HotelRoom room5 = new HotelRoom("G-5", "I", 1, false, null);
		HotelRoom room6 = new HotelRoom("F-6", "II", 2, false, null);
		HotelRoom room7 = new HotelRoom("F-7", "II", 2, false, null);
		HotelRoom room8 = new HotelRoom("F-8", "II", 2, false, null);
		HotelRoom room9 = new HotelRoom("F-9", "II", 2, false, null);
		HotelRoom room10 = new HotelRoom("F-10", "II", 2, false, null);
		HotelRoom room11 = new HotelRoom("S-11", "III", 3, false, null);
		HotelRoom room12 = new HotelRoom("S-12", "III", 3, false, null);
		HotelRoom room13 = new HotelRoom("S-13", "III", 3, false, null);
		HotelRoom room14 = new HotelRoom("S-14", "III", 3, false, null);
		HotelRoom room15 = new HotelRoom("S-15", "III", 3, false, null);
		Guest guest = new Guest("Dhoni", 36);
		room1.setOccupied(true);
		room1.setGuest(guest);
		HotelRoom currentRoom=room1;
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		String cssFileLocation = "Styles/Style3.css";
		String linkStr = "<link href='" + cssFileLocation + "'" + " rel='" + "stylesheet" + "'>";
		out.println(linkStr);
		out.println("</head>");
		out.println("<body>");
		String str1 = "<form action='' method='get'>";

		String str2 = "</form>";
		StringBuffer buffer;
		out.println(str1);
		out.print("<table>");

		out.print("<tr>");
		out.println("<td class='caption'>");
		out.println("ROOM NO");
		out.println("</td>");
		out.println("<td class='editData'>");
		buffer = new StringBuffer();
		buffer.append("<input type='text' name='txt_roomNo'  value='");
		buffer.append(room1.getRoomNo() + "'" + " readonly>");
		out.println(buffer.toString());

		out.println("</td>");
		out.println("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>");
		out.println("FLOOR NO");
		out.println("</td>");
		out.println("<td class='editData'>");
		buffer = new StringBuffer();

		buffer.append("<input type='text' name='txt_floorNo'  value='");
		buffer.append(room1.getFloorNo() + "'" + " readonly>");
		out.println(buffer.toString());

		out.println("</td>");
		out.println("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>");
		out.println("ROOM TYPE");
		out.println("</td>");
		out.println("<td class='editData'>");
		buffer = new StringBuffer();
		if (currentRoom.getRoomType() == 1) {
			buffer.append("<input type='radio' name='rad_roomType' value='DELUXE' checked >");
			buffer.append("DELUXE");
			
				buffer.append("<input type='radio' name='rad_roomType' value='ULTRA_DELUXE'  disabled>");
			buffer.append("ULTRA DELUXE");
			
			buffer.append("<input type='radio' name='rad_roomType' value='SUPERIOR'  disabled>");
			buffer.append("SUPERIOR");
		} else if (currentRoom.getRoomType() == 2) {
			buffer.append("<input type='radio' name='rad_roomType' value='DELUXE'  disabled>");
			buffer.append("DELUXE");
			buffer.append("<input type='radio' name='rad_roomType' value='ULTRA_DELUXE'  readonly>");
			buffer.append("ULTRA DELUXE");
			buffer.append("<input type='radio' name='rad_roomType' value='ULTRA_DELUXE'  disabled>");
			buffer.append("ULTRA DELUXE");

		} else {
			buffer.append("<input type='radio' name='rad_roomType' value='DELUXE'  disabled>");
			buffer.append("DELUXE");
			buffer.append("<input type='radio' name='rad_roomType' value='ULTRA_DELUXE'  disabledr>");
			buffer.append("ULTRA DELUXE");
			buffer.append("<input type='radio' name='rad_roomType' value='SUPERIOR' checked readonly>");
			buffer.append("SUPERIOR");

		}

		out.println(buffer.toString());
		out.println("</td>");
		out.println("</tr>");

		out.print("<tr>");
		out.println("<td colspan='2'>");
		buffer = new StringBuffer();
		if (currentRoom.isOccupied() == true) {
			buffer.append("<input type='checkbox' value='Yes' name='check_occupied' checked >");
			buffer.append("IS BOOKING");
		} else {
			buffer.append("<input type='checkbox' value='No' name='check_occupied' >");
			buffer.append("IS BOOKING");
		}

		out.print(buffer.toString());
		out.println("</td>");
		out.println("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>");
		out.println("GENDER NAME");
		out.println("</td>");
		out.println("<td class='editData'>");
		buffer = new StringBuffer();
		if (currentRoom.isOccupied() == true) {

			buffer.append("<input type='text' name='txt_genderName'  value='");
			buffer.append(currentRoom.getGuest().getName() + "'" + " >");

		} else {
			buffer.append("<input type='text' name='txt_genderName'  value='");
			buffer.append("NULL" + "'" + " >");
		}
		out.println(buffer.toString());
		out.println("</td>");
		out.println("</tr>");

		out.print("<tr>");
		out.println("<td class='caption'>");
		out.println("GENDER AGE");
		out.println("</td>");
		out.println("<td class='editData'>");
		buffer = new StringBuffer();
		if (currentRoom.isOccupied() == true) {

			buffer.append("<input type='text' name='txt_genderAge'  value='");
			buffer.append(currentRoom.getGuest().getAge() + "'" + " >");

		} else {
			buffer.append("<input type='text' name='txt_genderAge'  value='");
			buffer.append("NULL" + "'" + " >");
		}
		out.println(buffer.toString());
		out.println("</td>");
		out.println("</tr>");

		out.print("<tr>");
		out.println("<td colspan='2'>");
		out.print("<input type='submit' value='UPDATE'>");

		out.println("</td>");
		out.println("</tr>");

		out.println("</table>");
		out.println(str2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
