package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Write a program to check if a number is a perfect number.
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be checked it is perfect or not  :");
		int number = sc.nextInt();
		
		boolean result =isPerfect(number);
		
			if(result)
				System.out.println("Entered number is perfect :"+number);
			else
				System.out.println("Entered number is not perfect :"+number);
	}
	
	static boolean isPerfect(int num) {
		int sum=0;
		
		 for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum =sum+ i;
	            }
	        }
		 return sum==num;
	} 

}
