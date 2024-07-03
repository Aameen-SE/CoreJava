package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class MultiplicationofNum {

	public static void main(String[] args) {
		// Print the multiplication table of a given number.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");

		int num = sc.nextInt();

		System.out.println("Multiplication of a number :"+num);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
