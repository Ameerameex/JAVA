package com.training.ui;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.training.business.ContactInfo;
import com.training.business.Person;

public class Main1 {

	static void insertTest() {
		EntityManager entityManager;
		entityManager = Persistence.createEntityManagerFactory("salesdb").createEntityManager();
		Person person = new Person(2, "Clarke", new Date());
		entityManager.getTransaction().begin();
		entityManager.persist(person);

		entityManager.getTransaction().commit();
		System.out.println("Person saved to DB");

	}

	static void loadTest() {
		Person person;
		EntityManager entityManager;
		entityManager = Persistence.createEntityManagerFactory("salesdb").createEntityManager();
		person = entityManager.find(Person.class, 2);
		System.out.println(person);

	}

	static void updateTest() {
		Person person = new Person(1, "ramesh", new Date());
		EntityManager entityManager;
		entityManager = Persistence.createEntityManagerFactory("salesdb").createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(person);
		entityManager.getTransaction().commit();
		System.out.println("updated");

	}

	static void readAllTest() {

		EntityManager entityManager;
		entityManager = Persistence.createEntityManagerFactory("salesdb").createEntityManager();
		Query query = entityManager.createQuery("from Person");
		List<Person> persons = query.getResultList();
		System.out.println(persons);
	}

	static void deleteTest() {

		EntityManager entityManager;
		entityManager = Persistence.createEntityManagerFactory("salesdb").createEntityManager();
		Person person = entityManager.find(Person.class, 2);

		entityManager.getTransaction().begin();
		entityManager.remove(person);
		entityManager.getTransaction().commit();
		System.out.println("deleted");

	}

	public static void main(String[] args) {

		// insertTest();
		 readAllTest();
		// updateTest();
		// readAllTest();
		// loadTest();
		//deleteTest();
	}

}
