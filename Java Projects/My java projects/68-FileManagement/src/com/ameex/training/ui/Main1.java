package com.ameex.training.ui;

import java.io.File;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) {
		
		File file;
		file=new File("c:\\DemoFolder\\Postfix123.java");
		System.out.println(file.exists());
		
		File file2=new File("c:\\DemoFolder");
		System.out.println(file2.isDirectory());
		
		File file3=new File("c:\\DemFolder\\myResume.txt");
		
			
		File file4=new File("c:\\DemoFolder\\myResume.txt");
		
			
			file4.delete();
			
			File file5=new File("c:\\DemoFolder\\icon-mail.png");
			File file6=new File("c:\\DemoFolder1\\mail.png");
			file5.renameTo(file6);


		}
	}

