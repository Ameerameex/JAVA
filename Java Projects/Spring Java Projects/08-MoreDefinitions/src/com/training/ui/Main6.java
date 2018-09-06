package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Circle;
import com.training.business.Player;

public class Main6 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
String[] arr={"beans.xml","beans1.xml","beans2.xml","beans3.xml","beans4.xml","beans5.xml"};
		ApplicationContext appletContext = new ClassPathXmlApplicationContext(arr);

		System.out.println(appletContext.getBean("team1"));
		System.out.println(appletContext.getBean("team2"));
		System.out.println(appletContext.getBean("team3"));
		
		System.out.println(appletContext.getBean("positions"));
		
	}
}
