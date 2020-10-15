package com.kk.chap3;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		String firstName = in.next(); // delimited by whitespace
		System.out.println("how old are you?");
		int age = in.nextInt();
		System.out.println(name);
		System.out.println(firstName);
		System.out.println(age);
	}

}
