package com.ameex.training.ui;

import java.io.File;

public class Main2 {

	public static void main(String[] args) {
		
		File file1=new File("c:\\DemoFolder");
		File file2=new File(file1, "Postfix.java");
		
		System.out.println(file2.exists());
		
		System.out.println(file2.getTotalSpace());
		
		System.out.println(file2.canWrite());
		file2.setWritable(true);
		
	}
}
