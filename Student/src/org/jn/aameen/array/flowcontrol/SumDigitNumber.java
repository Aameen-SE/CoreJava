package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class SumDigitNumber {

	public static void main(String[] args) {
		// Calculate the sum of digits of a number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number =sc.nextInt();
		int sum ;
		for(sum =0;number!=0;number=number/10)
		{
			sum = sum+number%10;
			
		}
		System.out.println(sum);
	}

}
