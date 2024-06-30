package org.jn.aameen.ifelse;
import java.util.Scanner;
public class MaxBetwThree {

	public static void main(String[] args) {
		// Write a program to find maximum between three numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2 =sc.nextInt();
		System.out.println("Enter the third number ");
		int num3=sc.nextInt();
		
		
		if(num1>num2 && num1>num3)
			System.out.println("Maximum between three is firstnumber :"+num1);
		else if(num2>num1 && num2>num3)
			System.out.println("Maximum between three is secondnumber :"+num2);
		else
			System.out.println("Maximum between three is thirdnumber :"+num3);
		
	}

}
