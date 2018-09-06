package com.example.ui;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main5 {

	public static void main(String[] args) throws Exception {

		InputStream inputStream= new FileInputStream("CityList.txt");
		Reader reader=new InputStreamReader(inputStream);
		BufferedReader bufferedReader=new BufferedReader(reader);
		
		String string=null;
		while(true){
			string=bufferedReader.readLine();
			if(string==null){
				break;
			}
			
			
			System.out.println(string);
			
		}
		bufferedReader.close();
		reader.close();
		inputStream.close();
		
	}

}