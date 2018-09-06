package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		System.out.println("\t\t [ Uploading Receiver Servlet 2");
		Collection<Part> parts=request.getParts();
		//Part part=request.getPart("file_upload_name");
		
		for (Part part : parts) {
			
		
		String uploadFolder="C:\\NewUploadLocation\\";
		String fileName=part.getSubmittedFileName();
		
		
		String actualFileName=uploadFolder+fileName;
		System.out.println("\t\t[ "+fileName+"] received From client....");
		
		String typeOfFile=part.getContentType();
		
		System.out.println("\t\t[Type OF File is "+typeOfFile+"]");
		
		System.out.println("\t\t [Start Writing to File in Server Upload Location ]");
		part.write(actualFileName);
		 
		List<String> info=new ArrayList<String>();
		info.add(fileName+" is Uploaded SuccessFully");
		request.setAttribute("messages", info);
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("Status.jsp");
	
		dispatcher.forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
