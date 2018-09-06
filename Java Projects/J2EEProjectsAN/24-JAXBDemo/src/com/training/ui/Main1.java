package com.training.ui;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.training.business.Contact;

public class Main1 {

	public static void main(String[] args) {
		Contact contact=new Contact("ameex@gmail.com", "9361756567");
		
		try {
			JAXBContext context=JAXBContext.newInstance(Contact.class);
			Marshaller marshaller=context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(contact, System.out);
		} catch (JAXBException e) {

			e.printStackTrace();
		}
		
	}

}
