package com.ameex.training.ui;

import java.io.File;

public class Main3 {

	public static void main(String[] args) {
		File file=new File("C:\\DemoFolder\\DemoFolder2");
		
		if(file.isDirectory())
		{
			String[] arr=file.list();
			for (String string : arr) {
				System.out.println(string);
			}
			
		}
		
		if(file.isDirectory())
		{
			File[] arr=file.listFiles();
			for (File file2 : arr) {
				System.out.println(file2.getAbsolutePath()+", "+file2.getName());
			}
			
		}
		
		File file2=new File("c:\\DemoFolder\\temp");
		file2.mkdir();
		
	}
}
