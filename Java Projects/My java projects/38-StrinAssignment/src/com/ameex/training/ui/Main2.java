package com.ameex.training.ui;

import java.util.Date;

import com.ameex.training.bean.Person;

public class Main2 {

	public static void main(String[] args) {

		Date temp=new Date(((24L*60L*60L*1000L)*365L)*25L);
		System.out.println(temp);
		Person person=new Person("Suriya", temp);
		
		System.out.println(person.getDaysCount());
		
		
	}

}
