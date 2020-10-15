package com.kk.chap3;

import java.util.Arrays;

public class ForEachTest {

	public static void main(String[] args) {
		int[] a = new int[10];
		for(int i = 0; i <= a.length -1 ; i++) {
			a[i] = i;
		}
		for (int i : a) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(a)); //this is another way of printing an array

	}

}
