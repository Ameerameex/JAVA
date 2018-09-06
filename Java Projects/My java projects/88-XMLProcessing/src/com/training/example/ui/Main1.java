package com.training.example.ui;

import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Main1 {

	public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		
		Document document=builder.parse("Book.xml");
		System.out.println(document.getDocumentElement().getTagName());
		
		
		Element element=document.getDocumentElement();
		NodeList nodeList=element.getChildNodes();
		System.out.println(nodeList.getLength());
		
		NodeList nodeList2=document.getElementsByTagName("price");
		Node node=nodeList2.item(0);
		
		Element element2=(Element) node;
	    System.out.println(element2.getTagName()+":"+element2.getTextContent());
		
	
		
		
		

	}

}
