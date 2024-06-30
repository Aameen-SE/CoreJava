package org.jn.aameen.ifelse;
import java.util.Scanner;
public class CheckNumCondition {

	public static void main(String[] args) {
		// Write a program to check whether a number is negative, positive or zero
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		if(num>0)
			System.out.println("The number is positive num:"+num);
		else if (num<0)
			System.out.println("The number is negative num:"+num);
		else 
			System.out.println("The number is equal to zero num:"+num);
	}

}
