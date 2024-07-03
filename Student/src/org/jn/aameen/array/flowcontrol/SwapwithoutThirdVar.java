package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class SwapwithoutThirdVar {

	public static void main(String[] args) {
		// Swap two numbers without using a temporary variable.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of firstnum");
		int num1=sc.nextInt() ;
		
		System.out.println("Enter the value of secondnum");
		int num2=sc.nextInt();
		
		System.out.println("Original firstnum :"+num1+" ; Secondnum :"+num2);
		
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swaping firstnum :"+num1+" ; Secondnum :"+num2);

	}

}
