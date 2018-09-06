package com.training.db;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.training.business.Answer;
import com.training.business.Question;


public class DAOImpl implements DAO {

	static Scanner scanner=new Scanner(System.in);
	
	
	@Override
	public boolean insertTesting(Question question) {
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metaData.getSessionFactoryBuilder().build();

		

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

	
		session.persist(question);

		transaction.commit();
session.close();
return true;
	}

	@Override
	public List<Question> listTesting() {
		StandardServiceRegistry standardRegistry = 
			       new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metaData = 
			        new MetadataSources(standardRegistry).getMetadataBuilder().build();
				SessionFactory sessionFactory = metaData.getSessionFactoryBuilder().build();
				
				System.out.println("connected to db");
				
				Session session=sessionFactory.openSession();
				
				String HQL="from Question";
				
				Query<Question> query=session.createQuery(HQL);
				
				List<Question> questions=query.list();
				/*for (int i = 0; i <questions.size(); i++) {
					
				String qn=questions.get(i).getQuestionText();
				
				System.out.println(questions.get(i).getId()+"."+qn);
				
				System.out.println("Choices : ");
				for (int j = 0; j< questions.get(i).getChoices().size();j++) {
					System.out.println("\t"+(j+1)+". "+questions.get(i).getChoices().get(j).getAnswerText());
					
				}
				}*/
				return questions;		
				
	}

	@Override
	public void loadTesting() {
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory = metaData.getSessionFactoryBuilder().build();

		

		Session session = sessionFactory.openSession();
		Question question1=null;
		String HQL="from Question";
		
		Query<Question> query=session.createQuery(HQL);
		
		List<Question> questions=query.list();
		 int mark=0;
			int total=0;
		
		for (int j = 1; j<=questions.size(); j++) {
			
		

		//Transaction transaction = session.beginTransaction();

		
		question1=session.load(Question.class, j);
		
		String qn=question1.getQuestionText();
		List<Answer> choices= question1.getChoices();
		
		
		
		System.out.println(question1.getId()+"."+qn);
		
		System.out.println("Choices : ");
		for (int i = 0; i < choices.size(); i++) {
			System.out.println("\t"+(i+1)+". "+choices.get(i).getAnswerText());
			
		}
			Answer answer=question1.getCorrectAnswer();
		
		System.out.println("Enter Your Choice");
		int choice=scanner.nextInt();
		
		
		
		
		if(choices.get(choice-1).getAnswerText().equalsIgnoreCase(answer.getAnswerText())) {
			
			mark+=question1.getMarkWeightage();
			
		}
		total+=question1.getMarkWeightage();
		}
		session.close();
		
	
			System.out.println("Your Mark is "+mark+" out Of "+total);
	}

}
