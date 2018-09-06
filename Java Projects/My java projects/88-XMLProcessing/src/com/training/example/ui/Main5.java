package com.training.example.ui;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main5 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=builderFactory.newDocumentBuilder();
		
		
		Document document=builder.parse("Trips.xml");
		
		Element element=(Element) document.getElementsByTagName("trip").item(1);
		
	NamedNodeMap map=	element.getAttributes();
	for (int i = 0; i < map.getLength(); i++) {
		Node node =map.item(i);
		Attr attr=(Attr) node;
		System.out.println(attr.getName()+":" +attr.getValue());
	}
	
		System.out.println(((Element)document.getElementsByTagName("trip").item(1)).hasAttributes());
		System.out.println(((Element)document.getElementsByTagName("fare").item(0)).hasAttributes());
		System.out.println(((Element)document.getElementsByTagName("femaleCount").item(1)).hasAttributes());


	}

}
