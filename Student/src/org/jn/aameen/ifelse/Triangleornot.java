package org.jn.aameen.ifelse;

import java.util.Scanner;

public class Triangleornot {

	public static void main(String[] args) {
		// Write a program to input angles of a triangle and check whether triangle is valid or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first angle ");
		int angle1 =sc.nextInt();
		System.out.println("Enter the second angle");
		int angle2=sc.nextInt();
		System.out.println("Enter the third angle ");
		int angle3=sc.nextInt();
		
		int sum=angle1+angle2+angle3;
		
		if(sum==180 && angle1>0 && angle2>0 && angle3>0)
			System.out.println("The triangle is valid");
		else
			System.out.println("The triangle is not valid ");
		
		
		
	}

}
