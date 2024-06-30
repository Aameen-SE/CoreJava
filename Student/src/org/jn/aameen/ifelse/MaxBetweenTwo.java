package org.jn.aameen.ifelse;
import java.util.Scanner;

public class MaxBetweenTwo {

	public static void main(String[] args) {
		// Write a program to find maximum between two numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num");
		int num1 = sc.nextInt();
		System.out.println("Enter the second num");
		int num2 =sc.nextInt();
		
		if(num1>num2)
			System.out.println("The first num is maximum between two :"+num1);
		else
			System.out.println("The second num is maximum between two :"+num2);

	}

}
