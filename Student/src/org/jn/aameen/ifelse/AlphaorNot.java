package org.jn.aameen.ifelse;
import java.util.Scanner;
public class AlphaorNot {

	public static void main(String[] args) {
		// Write a program to check whether a character is alphabet or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		
		char ch = sc.next().charAt(0);
		
		if(ch>='a'&&ch<='z' || ch>='A' && ch<='Z')
			System.out.println("The character entered is alphabet , ch :"+ch);
		else
			System.out.println("The character entered is not alphabet , ch :"+ch);
	}

}
