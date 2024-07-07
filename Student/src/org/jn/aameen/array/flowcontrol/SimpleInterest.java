package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// Write a program to calculate simple interest.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principal to find the simple interest : ");
		int principal=sc.nextInt();
		
		System.out.println("Enter the rate to find the simple interest : ");
		int rate=sc.nextInt();
		
		System.out.println("Enter the time  to find the simple interest : ");
		int time=sc.nextInt();
		
		float simpleInterest = (principal*rate*time)/100;
		
		System.out.println("Simple Interest :"+simpleInterest);
		
		
		
		

	}

}
