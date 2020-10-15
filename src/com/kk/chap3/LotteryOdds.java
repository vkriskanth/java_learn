package com.kk.chap3;
import java.util.*;
/**
 * This program demonstrates a for loop
 * @author kanthkr
 *
 */

public class LotteryOdds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you need to draw? ");
		
		int k = in.nextInt();
		
		System.out.println("what is the highest number you can draw? ");
		int n = in.nextInt();
		in.close();
		
		/**
		 * computing binomial coefficient
		 */
		int lotteryOdds = 1;
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds * (n - i + 1) / i;
		}
		System.out.println("Your odds are 1 in "+lotteryOdds);
	}

}
