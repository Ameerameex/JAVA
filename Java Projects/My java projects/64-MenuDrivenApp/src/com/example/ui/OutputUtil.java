package com.example.ui;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OutputUtil {

	public void printData(double number, int width,int fractionDigits, int alignment) {
			String text;
			String formatCode="%";
			if(alignment==Alignments.LEFT)
				formatCode=formatCode+"-";
			formatCode=formatCode+width+"."+fractionDigits;
			formatCode=formatCode+"f";
			text=String.format(formatCode, number);
			System.out.print(text);
			return;

		}
	public void printData(float number, int width,int fractionDigits, int alignment) {
			String text;
			String formatCode="%";
			if(alignment==Alignments.LEFT)
				formatCode=formatCode+"-";
			formatCode=formatCode+width;
			formatCode=formatCode+"f";
			text=String.format(formatCode, number);
			System.out.print(text);
			return;

		}
	public void printData(int number, int width, int alignment) {		
		     String text;
			String formatCode="%";
			if(alignment==Alignments.LEFT)
				formatCode=formatCode+"-";
			formatCode=formatCode+width;
			formatCode=formatCode+"d";
			text=String.format(formatCode, number);
			System.out.print(text);
			return;

		}
	public void printData(byte number, int width, int alignment) {		
	     String text;
		String formatCode="%";
		if(alignment==Alignments.LEFT)
			formatCode=formatCode+"-";
		formatCode=formatCode+width;
		formatCode=formatCode+"d";
		text=String.format(formatCode, number);
		System.out.print(text);
		return;

	}
	public void printData(short number, int width, int alignment) {		
	     String text;
		String formatCode="%";
		if(alignment==Alignments.LEFT)
			formatCode=formatCode+"-";
		formatCode=formatCode+width;
		formatCode=formatCode+"d";
		text=String.format(formatCode, number);
		System.out.print(text);
		return;

	}

	

	public void printData(String data, int width, int alignment) {
		String text;
		String formatCode="%";
		if(alignment==Alignments.LEFT)
			formatCode=formatCode+"-";
		formatCode=formatCode+width;
		formatCode=formatCode+"s";
		text=String.format(formatCode, data);
		System.out.print(text);
		return;

	}

	public void printData(Character data) {
		String text;
		String formatCode="%";
		formatCode=formatCode+"c";
		text=String.format(formatCode, data);
		System.out.print(text);
		return;
		
	}
	public void printData(Date data, int width, int alignment) {
		String text;
		SimpleDateFormat  dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		String formatCode="%";
		if(alignment==Alignments.LEFT)
			formatCode=formatCode+"-";
		formatCode=formatCode+width;
		formatCode=formatCode+"s";
		text=dateFormat.format(data);
		text=String.format(formatCode, text);
		System.out.print(text);
		return;

	}
	public void printLine(int width){
		for (int i = 1; i < width; i++) 
			System.out.print("-");
			System.out.println();
		
}
}