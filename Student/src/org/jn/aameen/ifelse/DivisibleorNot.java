package org.jn.aameen.ifelse;
import java.util.Scanner;
public class DivisibleorNot {

	public static void main(String[] args) {
		// Write a program to check whether a number is divisible by 5 and 11 or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		
		if(num%5==0 && num%11==0)
			System.out.println("The number is divisble by 5 and 11 num: "+num);
		else 
			System.out.println("The number is not divisible by 5 and 11 num: "+num);
	}

}
