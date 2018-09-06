package com.training.example.ui;

import java.awt.dnd.DnDConstants;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Main3 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		

		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		
		Document document=builder.parse("Doctors.xml");
		
		Element element=document.getDocumentElement();
		String text=element.getTextContent();
		
		System.out.println(text);
		
		Element element2=(Element) document.getElementsByTagName("fees").item(0);
		System.out.println(element2.getTextContent());
		Element element3=(Element) document.getElementsByTagName("fees").item(1);
		System.out.println(element3.getTextContent());
		
		
		NodeList list=document.getElementsByTagName("name");
		Node node=list.item(0);
		Element element4=(Element) node;
		NodeList list2=document.getElementsByTagName("fees");
		 node=list2.item(0);
		Element element5=(Element) node;

		NodeList list3=document.getElementsByTagName("name");
		 node=list3.item(1);
		Element element6=(Element) node;

		NodeList list4=document.getElementsByTagName("fees");
		 node=list4.item(1);
		Element element7=(Element) node;

		System.out.println(element4.getTextContent()+":"+element5.getTextContent() );
		System.out.println(element6.getTextContent()+":"+element7.getTextContent() );

		
				
		
	}

}
