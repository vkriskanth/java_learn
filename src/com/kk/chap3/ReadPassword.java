package com.kk.chap3;
import java.io.Console;

/**
 * This program demonstrates how to read password
 * @author kanthkr
 *
 */

public class ReadPassword {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Console cons = System.console();
		System.out.println("test");
		String username = cons.readLine("Username: ");
		char[] passwd = cons.readPassword("Password: ");
		//System.out.println("Username is "+username+ " Password is "+passwd.toString());
	}

}
