package com.training.example.ui;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		
		Document document=builder.parse("Contacts1.xml");
		
		NodeList list=document.getElementsByTagName("name");
		
		NodeList list2=document.getElementsByTagName("phone");
		
		System.out.println(list.getLength());
		System.out.println(list2.getLength());
		
		for (int i = 0; i <list.getLength(); i++) {
			
			Node node=list.item(i);
			Element element=(Element) node;
			Node node2=list2.item(i);
			Element element2=(Element) node2;
			
			System.out.println(element.getTextContent()+":"+element2.getTextContent());
			
			
		}

//		for (int i = 0; i <list2.getLength(); i++) {
//			
//			Node node=list2.item(i);
//			Element element=(Element) node;
//			
//			System.out.println(element.getTextContent());
//			
//			
//		}
		
		
	}

}
