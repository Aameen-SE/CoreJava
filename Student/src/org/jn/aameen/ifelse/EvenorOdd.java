package org.jn.aameen.ifelse;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		// Write a program to check whether a number is even or odd
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is even or odd");
		
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("The number is even, num : "+num);
		else 
			System.out.println("The number is odd, num : "+num);

	}

}
