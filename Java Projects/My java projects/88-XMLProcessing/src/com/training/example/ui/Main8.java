package com.training.example.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.training.example.business.Contact;

public class Main8 {

	public static void main(String[] args) throws Exception {
		
		
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder  builder=builderFactory.newDocumentBuilder();
		
		Document document=builder.parse("Contacts1.xml");
		
		Element element=(Element) document.getElementsByTagName("name").item(0);
		Element element1=(Element) document.getElementsByTagName("phone").item(0);
		Element element2=(Element) document.getElementsByTagName("name").item(1);
		Element element3=(Element) document.getElementsByTagName("phone").item(1);
		Element element4=(Element) document.getElementsByTagName("name").item(2);
		Element element5=(Element) document.getElementsByTagName("phone").item(2);

		
	List<Contact> contacts=new ArrayList<>();
	Contact contact1=new Contact();

	contact1.setName(element.getTextContent());
	contact1.setPhone(element1.getTextContent());

//	contacts.add(contact.getName());
//	
//	contacts.add(contact.getPhone());
//	


	Contact contact2=new Contact();

	contact2.setName(element2.getTextContent());
	contact2.setPhone(element3.getTextContent());
//
//	contacts.add(contact.getName());
//	contacts.add(contact.getPhone());
//	

	Contact contact3=new Contact();

	contact3.setName(element4.getTextContent());
	contact3.setPhone(element5.getTextContent());
	
	
//	contacts.add(contact.getName());
//	contacts.add(contact.getPhone());
//	
	
	contacts.add(contact1);
	contacts.add(contact2);
	contacts.add(contact3);

	
		System.out.println(contacts);
		
		
		
		

	}

}
