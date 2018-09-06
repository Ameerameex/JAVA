package com.example.ui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main3 {

	public static void main(String[] args) throws Exception {
		

		InputStream inputStream=new FileInputStream("MyData.txt");
		Reader reader=new InputStreamReader(inputStream);
		BufferedReader  bufferedReader=new BufferedReader(reader);
		String string=bufferedReader.readLine();
		String string2=bufferedReader.readLine();
		String string3=bufferedReader.readLine();
		String string4=bufferedReader.readLine();
		String string5=bufferedReader.readLine();
				System.out.println(string);
				System.out.println(string2);
				System.out.println(string3);
				System.out.println(string4);
				System.out.println(string5);
				bufferedReader.close();
				reader.close();
				inputStream.close();

		
	}

}
