package com.training.example.ui;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Main4 {

	public static void main(String[] args) throws Exception, Exception {
		

		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		
		Document document=builder.parse("Doctors.xml");
		Element element=(Element) document.getElementsByTagName("doctor").item(0);
		System.out.println(element.getAttribute("id"));
		Element element1=(Element) document.getElementsByTagName("doctor").item(1);
		System.out.println(element1.getAttribute("id"));
	}

}
