package com.training.customtags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class DateDisplayTagHandler extends SimpleTagSupport{

	String pattern;
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public void doTag() throws JspException, IOException {

		JspContext context=getJspContext();
		JspWriter out=context.getOut();
		Date today=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat(this.pattern);
		String date=dateFormat.format(today);
		out.print("<h1>");
		out.print(date);
		out.print("</h1>");

		
	}
	
}
