package com.ameex.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ameex.training.business.Category;
import com.ameex.training.business.Product;
import com.ameex.training.db.MySQLProductDAOImpl;
import com.ameex.training.db.ProductDAO;

public class ProductEditingServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ServletContext context=getServletContext();
		String applicationtitle=context.getInitParameter("portalTitle");
		
		ServletConfig config=getServletConfig();
		String moduleName=config.getInitParameter("moduleTitle");
		String cssFile=config.getInitParameter("cssFile");
		out.println("<h1>"+applicationtitle+"</h1>");
		out.println("<h2>"+moduleName+"</h2>");
		out.println("<link href='"+cssFile+"' rel='stylesheet'>");
		
		
		String s1=request.getParameter("txt_id");
		int id=0;
		if(s1!=null && s1.trim().length()>0){
			id=Integer.parseInt(s1);
		}
		Product product=new Product();
		product.setId(id);
		
		ProductDAO dao=new MySQLProductDAOImpl();
		
		try {
			product=dao.findProduct(id);
		} catch (Throwable e) {

			request.setAttribute("statusString","There is Problem In Finding the Product For Editing");
			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/StatusDisplayer.jsp");
			dispatcher.forward(request, response);
		}
		if(product==null){
			
			request.setAttribute("statusString","Product Not Found");
			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/StatusDisplayer.jsp");
			dispatcher.forward(request, response);
		}else{
			
			request.setAttribute("product",product);
			Category category=new Category('L',"LAPTOP");
			Category category2=new Category('M',"MOBILE");
			Category category3=new Category('T',"TELEVISION");
			Category category4=new Category('A',"AIR CONDITIONER");
			
			List<Category> categories=new ArrayList<>();
			categories.add(category);
			categories.add(category2);
			categories.add(category3);
			categories.add(category4);
			
			request.setAttribute("categories",categories);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/Pages/JSP/ProductEdit.jsp");
			dispatcher.include(request, response);
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
