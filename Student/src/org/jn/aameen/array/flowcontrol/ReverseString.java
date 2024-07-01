package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a given string.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to be reversed ");
		String name =sc.next();
		String reverse ="";
		char ch ;
		
		System.out.println("Name given :"+name);
		
		for(int i =0;i<name.length();i++)
		{
			ch = name.charAt(i);
			reverse = ch+reverse;
		}
		
		System.out.println("Name after reverse :"+reverse);

	}

}
