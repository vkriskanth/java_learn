package com.kk.chap3;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int[] smallPrimes = new int[10];
		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j <= Math.sqrt(i) ; j++) {
				if (j % 2 == 0) {
					break;
				}
				else
					continue;
			}
		}

	}

}
