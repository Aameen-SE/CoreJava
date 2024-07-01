package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class FactorialofaNum {

	public static void main(String[] args) {
		// Find the factorial of a given number.
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial :");
		int num = sc.nextInt();
		int factorial =1;
		
		for(int i =1;i<=num;i++)
		{
			factorial = factorial*i;
		}
		System.out.println("Factorial of a  num:"+num +", factorial is "+factorial);
		
		
		
	}

}
