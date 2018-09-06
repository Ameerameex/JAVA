package com.ameex.training.ui;

import com.ameex.training.bean.StringManipulator;

public class Main1 {

	public static void main(String[] args) {
		
		
		StringManipulator manipulator=new StringManipulator("abc xyz hello how are you?");
		
System.out.println(manipulator.removeSpaces());
System.out.println(manipulator.seperateWithComma());
System.out.println(manipulator.seperate('?'));
	}

}
