package com.kk.chap3;
import java.util.*;

/**
 * this program demonstrates array manipulation
 * @author kanthkr
 *
 */

public class LotteryDrawing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw?");
		int n = in.nextInt();
		
		in.close();
		
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		//draw k numbers and put them into second array
		int[] result = new int[k];
		for(int i = 0; i < result.length; i++) {
			//make a random index between 0 and n - 1
			int r = (int) (Math.random() * n);
			//pick element at the random location
			result[i] = numbers[r];
			
			//move the last element into the random location
			numbers[r] = numbers[n -1];
			n--;
		}
		
		//print the sorted array
		Arrays.sort(result);
		System.out.println("Bet the folloiwng combination");
		for (int r: result)
			System.out.println(r);
		

	}

}
