package com.ameex.training.bean;

public class StringManipulator {

	private String data;

	public StringManipulator(String data) {
		super();
		this.data = data;
	}

	public String removeSpaces() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < data.length(); i++) {

			char ch = data.charAt(i);
			if (ch != ' ') {
				buffer.append(ch);
			}

		}

		return buffer.toString();
	}

	public String seperateWithComma() {

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < data.length(); i++) {

			char ch = data.charAt(i);
			if (ch != ' ') {

				buffer.append(ch);
							}
			else{
				
				buffer.append(",");
			}
		}
		return buffer.toString();
	}

	public String seperate(char ch) {

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < data.length(); i++) {

			char ch1= data.charAt(i);
			if (ch1 != ' ') {

				buffer.append(ch1);
							}
			else{
				
				buffer.append(ch);
			}
		}
		return buffer.toString();
		}

}
