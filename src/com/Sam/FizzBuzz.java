package com.Sam;

import java.util.Scanner;

/**
 * @author Hossaini sam 
 * date 06/10/2024
 * 
 */

public class FizzBuzz {

	/**
	 * main method
	 * @param args Command line arguments
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("inter a number");
		System.out.print("--> ");
		int num = input.nextInt();
		fizzBuzz(num);
	}
	
	/**
	 * In this part the method will get the number from the user and will put it in for loop and will see if the conditions much the if statement inside the for loop and the out put will be based on the condition
	 * @param num IT is the number that we got from the user in order to run our program
	 */

	public static void fizzBuzz(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}

		}
	}

}
