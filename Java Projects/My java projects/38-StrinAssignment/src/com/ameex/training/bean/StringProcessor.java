package com.ameex.training.bean;

public class StringProcessor {

	private String data;

	public StringProcessor(String data) {
		super();
		this.data = data;
	}

	public int getLength() {

		return data.length();
	}

	public int getLowerCaseCount() {
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);

			if (Character.isLowerCase(ch)) {
				count++;
			}

		}
		return count;
	}

	public int getUpperCaseCount() {
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);

			if (Character.isUpperCase(ch)) {
				count++;
			}

		}
		return count;
	}

	public int getDigitsCount() {
		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);

			if (Character.isDigit(ch)) {
				count++;
			}

		}
		return count;
	}

	public int getWordCount() {

		int count = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);

			if (Character.isWhitespace(ch)) {
				count++;
			}

		}
		return count+1;
	}
}
