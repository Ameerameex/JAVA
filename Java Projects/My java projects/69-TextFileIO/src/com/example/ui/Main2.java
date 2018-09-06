package com.example.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main2 {

	public static void main(String[] args) throws Exception {
		String s1="Myname : ";
		String name="Abishek";
		
		String s2="MyAge : ";
		int age=30;
		
		String s3="My Salary : ";
		double salary=12000.00;
		OutputStream outputStream=new FileOutputStream("data.txt");
		Writer writer=new OutputStreamWriter(outputStream);
		
		writer.write(s1);
		writer.write(name);
		writer.write("\n");
		writer.write(s2);
		writer.write(age+"\n");
		writer.write(s3);
		writer.write( salary+"");
		writer.flush();
		writer.close();
		outputStream.flush();
		outputStream.close();
		

		


	}

}
