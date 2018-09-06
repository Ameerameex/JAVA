package com.example.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main1 {

	public static void main(String[] args) throws Exception {
		
		File file=new File("AboutKanyakumari.txt");
		InputStream inputStream=new FileInputStream(file);
		Reader reader=new InputStreamReader(inputStream);
		
	char[] arr=new char[(int) file.length()];
	reader.read(arr);
	for (char c : arr) {
		System.out.print(c);
	}
	reader.close();
	inputStream.close();
	
		
	}

}
