package com.training.ui;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.training.business.ContactInfo;
import com.training.business.Customer;
import static com.training.ui.DateUtil.createDate;
public class Main1 {

	private static void insertTesting(Customer customer) {

		SessionFactory sessionFactory = getSession();
				
				System.out.println("Connected to DB");
				
				Session session=sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				session.persist(customer);
				transaction.commit();
				System.out.println("Object Stored");
			
				
				
	}

	private static void deleteTesting(Customer customer) {

		SessionFactory sessionFactory = getSession();
				
				System.out.println("Connected to DB");
				
				Session session=sessionFactory.openSession();
				
				Customer customer2=session.load(Customer.class, customer.getId());
				
				Transaction transaction=session.beginTransaction();
				session.delete(customer2);
				transaction.commit();
				System.out.println("deleted");
		
	}

	private static void updateTesting(Customer customer) {

		SessionFactory sessionFactory = getSession();
				
				System.out.println("Connected to DB");
				
				Session session=sessionFactory.openSession();
				
				Customer customer2=session.load(Customer.class, customer.getId());
				customer2.setNRICustomer(true);
				customer2.setAnnualIncome(23456.78);
				Transaction transaction=session.beginTransaction();
				session.merge(customer2);
				transaction.commit();
				System.out.println("updated");
	}

	private static void listTesting() {
		SessionFactory sessionFactory = getSession();
				
				System.out.println("Connected to DB");
				
				Session session=sessionFactory.openSession();
				
				String HQL="from Customer";
				
				Query query=session.createQuery(HQL);
				
				List<Customer> customers=query.list();
				
				System.out.println(customers);
				

	}

	private static void loadTesting(Customer customer) {

		SessionFactory sessionFactory = getSession();
				
				System.out.println("Connected to DB");
				
				Session session=sessionFactory.openSession();
				
				Customer customer2=session.load(Customer.class, customer.getId());
				
				System.out.println("Loaded");
				System.out.println(customer2);

				
	}

	private static SessionFactory getSession() {
		StandardServiceRegistry standardRegistry = 
			       new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
		System.out.println("-----");
				Metadata metaData = 
			        new MetadataSources(standardRegistry).getMetadataBuilder().build();
				SessionFactory sessionFactory = metaData.getSessionFactoryBuilder().build();
		return sessionFactory;
	}

	public static void main(String[] args) {

		/*Customer customer=new Customer("Neymar",createDate(2018, 10, 22), 'M', true, 123456.12,new ContactInfo("messi@gmail.com", "7894561230"));
		insertTesting(customer);*/
		
		/*Customer  customer=new Customer();
		customer.setId(101);
		loadTesting(customer);*/
		
		//listTesting();
		
		Customer customer=new Customer();
		customer.setId(2);
		updateTesting(customer);
		/*
		Customer customer=new Customer();
		customer.setId(102);
		deleteTesting(customer);*/
		
	}

}
