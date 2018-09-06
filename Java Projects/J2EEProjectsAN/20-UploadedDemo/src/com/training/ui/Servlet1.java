package com.training.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("\t\t [ Uploading Receiver Servlet 1");
		Part part = request.getPart("file_upload_name");
		String uploadFolder = "C:\\NewUploadLocatio\\";
		File file = new File(uploadFolder);
		String actualFileName=null;
		String fileName=null;
		
		if (file.exists()) {

			fileName = part.getSubmittedFileName();

			 actualFileName = uploadFolder + fileName;
		} else {
			file.mkdir();
			 fileName = part.getSubmittedFileName();

			 actualFileName = uploadFolder + fileName;
		}

		//System.out.println("\t\t[ " + fileName + "] received From client....");

		String typeOfFile = part.getContentType();

		System.out.println("\t\t[Type OF File is " + typeOfFile + "]");

		System.out.println("\t\t [Start Writing to File in Server Upload Location ]");
		part.write(actualFileName);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Status.jsp");
		List<String> info = new ArrayList<String>();
		info.add(fileName + " is Uploaded SuccessFully");
		request.setAttribute("messages", info);

		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
