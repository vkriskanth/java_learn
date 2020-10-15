package com.kk.chap3;

public class Strings {

	public static void main(String[] args) {
		String greeting = "Hello";
		String s = greeting.substring(0, 3);
		System.out.println(s);
		
		String expletive = "Expletive";
		String PG13 = "deleted";
		String message = expletive + PG13;
		System.out.println(message);
		
		String all = String.join(" /", "S", "M", "L","XL");
	    System.out.println(all);
	    
	    if (greeting == "Hello") {
	    	System.out.println("The strings are equal");
	    }
	    if(greeting.substring(0, 3).equals("Hel")) {
	    	System.out.println("The strings are equal here as well");
	    }
	    
	    String test = "test";
	    int n = test.length();
	    
	    int cpCount = test.codePointCount(0, n);
	    
	    System.out.println(cpCount);
	    char first = test.charAt(0);
	    char last = test.charAt(n - 1);
	    
	    System.out.println(first);
	    System.out.println(last-1);

	}

}
