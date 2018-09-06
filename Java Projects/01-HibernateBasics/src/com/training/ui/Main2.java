package com.training.ui;

import com.training.business.CarLoan;
import com.training.business.HomeLoan;
import com.training.business.Loan;
import static com.training.ui.DateUtil.createDate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Main2 {

	private static void insertTesting(Loan loan){
		SessionFactory sessionFactory = getSession();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.persist(loan);
		transaction.commit();
		
		System.out.println("Added");
	}
	private static void loadTesting(Loan loan){
		SessionFactory sessionFactory = getSession();
		Session session=sessionFactory.openSession();
		Loan loan2=session.load(Loan.class, loan.getLoanId());
		
		System.out.println(loan2);
		
	}
	private static void listTesting(){
		SessionFactory sessionFactory = getSession();
		Session session=sessionFactory.openSession();
		String HQL="from Loan";
		Query query=session.createQuery(HQL);
		List<Loan> loans=query.list();
		
		System.out.println(loans);
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

	/*	Loan loan=new Loan(1, "Ronaldo", createDate(2017, 12, 12), 3456.00);
		Loan loan2=new CarLoan(2, "Salah", createDate(2017, 12, 13), 3457.00,"TN-06-CR-1234",2017);
		Loan loan3=new HomeLoan(3,"Muller", createDate(2017, 11, 11), 1234.00, "Chennai", 2.0E6);
		
		insertTesting(loan);
		insertTesting(loan2);
		insertTesting(loan3);*/
		/*
		Loan loan=new Loan();
		loan.setLoanId(3);
		loadTesting(loan);*/
		
		listTesting();


	}

}
