package com.example.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

public class Main6 {

	public static void main(String[] args) throws Exception {

		InputStream inputStream= new FileInputStream("CityList.txt");
		Reader reader=new InputStreamReader(inputStream);
		LineNumberReader lineNumberReader=new LineNumberReader(reader);
		String string=null;
		
		while(true){
			string=lineNumberReader.readLine();
			if(string==null){
				break;
			}
			int i=lineNumberReader.getLineNumber();
			
			System.out.println(i+"."+string);
			
		}
		lineNumberReader.close();
		reader.close();
		inputStream.close();
		
		
	}

}
