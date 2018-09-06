package com.training.example.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputUtil {

	public int readIntInput(){
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		
		return input;
	}
	public byte readByteInput(){
		byte input=(byte)readIntInput();
		return input;
	}
	public short readShortInput(){
		short input=(short)readIntInput();
		return input;
	}
	public long readLongInput(){
		Scanner scanner=new Scanner(System.in);
		long input=scanner.nextLong();
		
		return input;
		
	}
	public float readFloatInput(){
		Scanner scanner=new Scanner(System.in);
		float input=scanner.nextFloat();
		
		return input;
		
	}public double readDoubleInput(){
		Scanner scanner=new Scanner(System.in);
		double input=scanner.nextDouble();
		
		return input;
		
	}
	public String readStringInput(){
		Scanner scanner=new Scanner(System.in);
		String input=scanner.next();
		
		return input;
		
	}
	public Date readDateInput(){
		String str=readStringInput();
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
		Date date=null;
		try {
			date=dateFormat.parse(str);
		} catch (ParseException e) {
			System.out.println("\t\t"+ e.getMessage());
		}
		return date;
	}
	
	public void prompt(String message){
		System.out.print("\t\t"+ message+ " : ");
	}
	public char readCharInput(){
		char input=readStringInput().charAt(0);
		return input;
		
	}
	public boolean readBooleanInput(){
		char ch=readCharInput();
		if(ch=='Y'||ch=='y')
			return true;
		
			return false;
		
	}
}
