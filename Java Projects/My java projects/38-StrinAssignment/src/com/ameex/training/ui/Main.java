package com.ameex.training.ui;

import com.ameex.training.bean.StringProcessor;

public class Main {

	public static void main(String[] args) {
		
		
		StringProcessor processor=new StringProcessor("abc45ABC hello how are you ?");
		
		System.out.println("Length of the String "+processor.getLength());
		System.out.println("Count of Lower "+processor.getLowerCaseCount());
		System.out.println("Count of Upper "+processor.getUpperCaseCount());
		System.out.println("Count of Digits "+processor.getDigitsCount());
		System.out.println("Count of word "+processor.getWordCount());

	}

}
