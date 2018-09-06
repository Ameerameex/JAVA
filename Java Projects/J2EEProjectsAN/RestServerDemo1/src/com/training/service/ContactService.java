package com.training.service;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.training.business.Contact;

@Path("/Contact")
public class ContactService {

	@Path("/getOneContact")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Contact getContact(){
		Contact contact=new Contact("Ameex", "ameex@gmail.com", "1234567890");
		
		return contact;
	}
	
	@Path("/getAllContacts")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> getContactList(){
		Contact contact=new Contact("Ameex", "ameex@gmail.com", "1234567890");
		Contact contact1=new Contact("Dhoni", "dhoni@gmail.com", "1234567890");
		Contact contact2=new Contact("Vijay", "vijay@gmail.com", "1234567890");
		Contact contact3=new Contact("Bravo", "bravo@gmail.com", "1234567890");
		
		List<Contact>  contacts=new ArrayList<>();
		contacts.add(contact);
		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(contact3);

		return contacts;
	}

	@Path("/findContact/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Contact findContact(@PathParam("name")String name){
		Contact contact=new Contact("Ameex", "ameex@gmail.com", "1234567890");
		Contact contact1=new Contact("Dhoni", "dhoni@gmail.com", "1234567890");
		Contact contact2=new Contact("Vijay", "vijay@gmail.com", "1234567890");
		Contact contact3=new Contact("Bravo", "bravo@gmail.com", "1234567890");
		
		List<Contact>  contacts=new ArrayList<>();
		contacts.add(contact);
		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(contact3);
		Contact  searchContact=new Contact();
		searchContact.setName(name);
		int index=contacts.indexOf(searchContact);
		if(index>=0){
			return contacts.get(index);
		}
		else{
			return null;
		}

		
	}
	@Path("/deleteContact/{name}")
	@DELETE
	public boolean deleteContact(@PathParam("name")String name){
		Contact contact=new Contact("Ameex", "ameex@gmail.com", "1234567890");
		Contact contact1=new Contact("Dhoni", "dhoni@gmail.com", "1234567890");
		Contact contact2=new Contact("Vijay", "vijay@gmail.com", "1234567890");
		Contact contact3=new Contact("Bravo", "bravo@gmail.com", "1234567890");
		
		List<Contact>  contacts=new ArrayList<>();
		contacts.add(contact);
		contacts.add(contact1);
		contacts.add(contact2);
		contacts.add(contact3);
		Contact  searchContact=new Contact();
		searchContact.setName(name);
		int index=contacts.indexOf(searchContact);
		if(index>=0){
			 contacts.remove(index);
			 return true;
		}
		else{
			return false;
		}

		
	}

}
