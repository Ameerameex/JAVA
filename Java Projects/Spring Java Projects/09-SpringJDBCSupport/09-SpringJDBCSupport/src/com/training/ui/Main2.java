package com.training.ui;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.User;
import com.training.db.UserDAO;

public class Main2 {

	static void insertTest() throws Throwable {
		User User = new User("Rohit@gmai.com", "12304ameer",1);
		
		UserDAO dao = getUserDAO();
	System.out.println(dao.addUser(User));
	}

	private static UserDAO getUserDAO() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
		
		UserDAO dao=(UserDAO) applicationContext.getBean("daoBean");
		return dao;
	}

	static void deleteTest() throws Throwable {
		User user = new User();
		user.setUserName("Rohit@gmai.com");
		UserDAO dao = getUserDAO();
	System.out.println(dao.deleteUser(user));
	}

	static void updateTest() throws Throwable {
	    User user=new User("dhoni", "123476", 2);
		UserDAO dao = getUserDAO();
		System.out.println(dao.updateUser(user));
	}

	static void findTest() throws Throwable {
		String userName="dhoni";
		UserDAO dao = getUserDAO();
		User user = dao.findUser(userName);
		System.out.println(user);

	}

	static void findAllTest() throws Throwable {
		UserDAO dao = getUserDAO();

		List<User> Users = dao.getAllUsers();
		for (User User : Users) {
			System.out.println(User);
		}
	}

	public static void main(String[] args) throws Throwable {

		// insertTest();
		updateTest();
	    //deleteTest();
		//findTest();
		//findAllTest();

	}

}
