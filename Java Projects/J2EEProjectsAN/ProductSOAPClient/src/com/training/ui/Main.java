package com.training.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.ameex.training.business.Product;
import com.ameex.training.service.ProductServiceImpl;
import com.ameex.training.service.ProductServiceImplService;

public class Main {

	public static void main(String[] args) throws ParseException, DatatypeConfigurationException {

		ProductServiceImplService implService=new ProductServiceImplService();
		ProductServiceImpl impl=implService.getProductServiceImpl();
		
		Product product=new Product();
		product.setId(129);
		product.setName("Acer");
		product.setPrice(10000.00);
		XMLGregorianCalendar gregFmt = DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(new Date()));
		product.setManufacturedDate(gregFmt);
		
		
		
		boolean  status=impl.addProduct(product);
		
		System.out.println(status);
		
	


	}

}
