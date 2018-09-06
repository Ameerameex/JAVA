package com.training.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CheckBoxDisplayHandler extends SimpleTagSupport {


	String caption;
	String size="2cm",backColor="red",fontName="verdana";
	String select="checked";
	
	public void setCaption(String caption) {
		this.caption = caption;
	}

	

	public void setSize(String size) {
		this.size = size;
	}



	public void setBackColor(String backColor) {
		this.backColor = backColor;
	}



	public void setFontName(String fontName) {
		this.fontName = fontName;
	}




		
		

		@Override
		public void doTag() throws JspException, IOException {
			String str="";
			str="<input type='checkbox' ";
			str=str+" "+this.select+" ";
			String styleStr="background-color:"+this.backColor+";";
			 styleStr=styleStr+" font-family:"+this.fontName+";";
			 styleStr=styleStr+" width: "+this.size+";";
			str=str+"style='"+styleStr+"'>"+this.caption;
			JspWriter out=getJspContext().getOut();
			out.print(str);

		
	}
}
