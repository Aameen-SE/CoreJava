package org.jn.aameen.string;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = sc.nextLine();
		String reverse ="";
		char ch;
		
		for(int i=0;i<string.length();i++)
		{
			ch = string.charAt(i);
			reverse=ch+reverse;
		}
		
		System.out.println("Reverse of the String : "+reverse);

	}

}
