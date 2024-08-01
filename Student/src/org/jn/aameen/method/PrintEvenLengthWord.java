package org.jn.aameen.method;

import java.util.Scanner;

public class PrintEvenLengthWord {

	public static void main(String[] args) {
		// Java program to print Even length words in a String
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Words : ");
		String words =sc.nextLine();
		
		printEvenWords(words);

	}
	
	public static void printEvenWords(String words)
	{
		for(String w : words.split(" "))
		{
			if(w.length()%2==0)
			{
				System.out.println(w);
			}
		}
		
	}

}
