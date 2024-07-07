package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class PowerofNum {

	public static void main(String[] args) {
		// Write a program to calculate the power of a number.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base :");
		double base=sc.nextDouble();
		
		System.out.print("Enter the components :");
		double component=sc.nextDouble();
		double result1=1;
		for(int i=1;i<=component;i++)
		{
			 result1=result1*base;
		}
		System.out.println(result1);
		
		
		double result = Math.pow(base, component);
		
		System.out.println("The power of a given number is :"+result);
		
	}

}
