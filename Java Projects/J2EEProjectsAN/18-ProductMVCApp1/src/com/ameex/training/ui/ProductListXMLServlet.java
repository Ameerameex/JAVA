package com.ameex.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ameex.training.business.Product;
import com.ameex.training.db.MySQLProductDAOImpl;
import com.ameex.training.db.ProductDAO;

public class ProductListXMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductDAO dao = new MySQLProductDAOImpl();

		try {
			List<Product> products = dao.getAllProducts();

			response.setContentType("text/xml");
			
			response.setHeader("Content-Disposition", "attachment; fileName=Products.xml");
			PrintWriter out = response.getWriter();
			
			out.println("<?xml version='1.0' ?>");

			out.println("<products>");
			for (Product product : products) {
				out.println("<product>");
				out.println("<id>" + product.getId() + "</id>");
				out.println("<name>" + product.getName() + "</name>");
				out.println("<price>" + product.getPrice() + "</price>");

				out.println("<manufacturedate>" + product.getManufacturedDate() + "</manufacturedate>");

				out.println("<category>" + product.getCategory() + "</category>");
				out.println("</product>");

			}

			out.println("</products>");
			

			request.setAttribute("statusString", "Products Downloaded in XML File");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Pages/JSP/StatusDisplayer.jsp");
			dispatcher.include(request, response);

		} catch (Throwable e) {

			request.setAttribute("statusString", "There iS a Problem in retrieving ProductList");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Pages/JSP/StatusDisplayer.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
