package com.ameex.training.ui;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ameex.training.business.Product;
import com.ameex.training.db.MySQLProductDAOImpl;
import com.ameex.training.db.ProductDAO;

public class NewProductAddingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String s1, s2, s3, s4, s5;
		s1 = request.getParameter("txt_id");
		s2 = request.getParameter("txt_name");
		s3 = request.getParameter("txt_price");
		s4 = request.getParameter("txt_mdate");
		s5 = request.getParameter("combo_category");

		int id = 0;
		String name = null;
		double price = 0.0;
		Date mDate = null;
		char category = '\0';
		if (s1 != null && s1.trim().length() > 0) {
			id = Integer.parseInt(s1);
		}
		if (s2 != null) {
			name = s2;
		}
		if (s3 != null && s3.trim().length() > 0) {
			price = Double.parseDouble(s3);
		}
		if (s4 != null && s4.trim().length() > 0) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			try {
				mDate = dateFormat.parse(s4);
			} catch (ParseException e) {

				e.printStackTrace();
			}
		}
		if (s5 != null && !(s5.equals("-"))) {
			category = s5.charAt(0);
		}
		Product product = new Product(id, name, price, mDate, category);

		ProductDAO dao = new MySQLProductDAOImpl();
		boolean status = false;
		try {
			status = dao.addProduct(product);
		} catch (Throwable e) {
			request.setAttribute("statusString", "Product Not Added 1");

		}
		if (status == true) {
			request.setAttribute("statusString", "Product Added SuccessFully");

		} else {
			request.setAttribute("statusString", "Product Not Added 2");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("StatusDisplayer.jsp");

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
