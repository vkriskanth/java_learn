package com.kk.chap3;
import java.util.*;

/**
 * This program demonstrates console input
 * @author kanthkr
 *
 */

public class InputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//get first input
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		//get second input
		System.out.print("What is your age? ");
		int age = in.nextInt();
		
		in.close();
		
		//display output on console
		System.out.println("Hello, "+ name + ". Next year you will be " + (age+1));

	}

}
