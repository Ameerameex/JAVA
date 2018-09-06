package com.ameex.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ameex.training.business.Product;
import com.ameex.training.db.MySQLProductDAOImpl;
import com.ameex.training.db.ProductDAO;

public class ProductListingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * PrintWriter out = response.getWriter(); ServletContext
		 * context=getServletContext(); String
		 * applicationtitle=context.getInitParameter("portalTitle");
		 * 
		 * ServletConfig config=getServletConfig(); String
		 * moduleName=config.getInitParameter("moduleTitle"); String
		 * cssFile=config.getInitParameter("cssFile");
		 * out.println("<h1>"+applicationtitle+"</h1>");
		 * out.println("<h2>"+moduleName+"</h2>");
		 * out.println("<link href='"+cssFile+"' rel='stylesheet'>");
		 */
		ProductDAO dao = new MySQLProductDAOImpl();

		try {
			List<Product> products = dao.getAllProducts();
			request.setAttribute("productList", products);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Pages/JSP/ProductListDisplayer.jsp");
			dispatcher.forward(request, response);

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
