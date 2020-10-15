package com.kk.chap3;

public class Strings2 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		char ch = 'A';
		builder.append(ch);
		String str = "This is a string builder method";
		builder.append(str);
		String completedString = builder.toString();
		System.out.println(completedString);

	}

}
