package com.training.ui;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.training.business.Contact;

public class Main3 {

	public static void main(String[] args) {

		Contact contact = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Contact.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			contact = (Contact) unmarshaller.unmarshal(new File("contact.xml"));
			System.out.println(contact);
		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

}
