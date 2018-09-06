package com.training;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class Main {
	static void insertRecord() {

		Contact contact=new Contact(3, "Ameex", "1234567890");
		
			Session session = CreateHibernateSession();  
		      
		    //creating transaction object  
		    Transaction t=session.beginTransaction();
		    session.save(contact);
		    t.commit();
		    System.out.println("Added");
		
		
	}

	static void showRecord() {

		Contact contact=null;
		Session session = CreateHibernateSession();  
	      
	    //creating transaction object  
	   
	    
	    contact=(Contact) session.load(Contact.class, 1);
	    System.out.println(contact);
	    
	    
		
	}

	static void updateRecord() {


		Contact contact=new Contact(1, "Dhoni", "1234567898");
		
			Session session = CreateHibernateSession();  
		      
		    //creating transaction object  
		    Transaction t=session.beginTransaction();
		    session.update(contact);
		    t.commit();
		    System.out.println("Updated");
		
	}

	static void showAll() {
		
		
		
		Session session = CreateHibernateSession();  
	     String hql="from Contact";
	    //creating transaction object  
	     Query query=session.createQuery(hql);
	     List<Contact> contacts=query.list();
	     
	    
	    
	   
	    System.out.println(contacts);
	}

	static void deleteRecord() {

		Contact contact=new Contact();
		contact.setId(1);
		
			
		Session session = CreateHibernateSession();  
  
		    //creating transaction object  
		    Transaction t=session.beginTransaction();
		    session.delete(contact);
		    t.commit();
		    System.out.println("Deleted");

	}

	private static Session CreateHibernateSession() {
		Configuration cfg=new Configuration();  
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		  
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		        cfg.getProperties()). build();
		SessionFactory sessionFactory;
		sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		  
		//creating session object  
		Session session=sessionFactory.openSession();
		return session;
	}

	public static void main(String[] args) {

		insertRecord();
		//showRecord();
		//updateRecord();
		//deleteRecord();
	}

}
