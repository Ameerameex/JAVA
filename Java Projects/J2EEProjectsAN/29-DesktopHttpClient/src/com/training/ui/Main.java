package com.training.ui;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

	public static void main(String[] args) throws Throwable {

		String input;
		
		input="http://www.rediff.com/news/column/do-the-gandhis-have-the-maturity-to-forge-alliances/20180531.htm";
		
		URL url=new URL(input);
		
		URLConnection connection=url.openConnection();
		InputStream inputStream=connection.getInputStream();
		
		while(true){
			int ch=inputStream.read();
			if(ch==-1){
				break;
			}
			char ch1=(char) ch;
			System.out.print(ch1);
		}

	}

}
