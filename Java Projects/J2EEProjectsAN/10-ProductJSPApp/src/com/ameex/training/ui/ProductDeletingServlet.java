package com.ameex.training.ui;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ameex.training.business.Product;
import com.ameex.training.db.MySQLProductDAOImpl;
import com.ameex.training.db.ProductDAO;

public class ProductDeletingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String s1=request.getParameter("txt_id");
		int id=0;
		if(s1!=null && s1.trim().length()>0){
			id=Integer.parseInt(s1);
		}
		Product product = new Product();
		product.setId(id);

		ProductDAO dao = new MySQLProductDAOImpl();
		boolean status = false;
		try {
			status = dao.deleteProduct(product);
		} catch (Throwable e) {
			request.setAttribute("statusString", "There is Problem in Deleting");

		}
		if (status == true) {
			request.setAttribute("statusString", "Product Deleted SuccessFully");

		} else {
			request.setAttribute("statusString", "Product Not Deleted");
		}

		RequestDispatcher dispatcher=request.getRequestDispatcher("StatusDisplayer.jsp");
		
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
