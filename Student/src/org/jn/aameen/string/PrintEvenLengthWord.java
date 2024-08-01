package org.jn.aameen.string;
import java.util.Scanner;
public class PrintEvenLengthWord {

	public static void main(String[] args) {
		// Java program to print Even length words in a String
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Words");
		String words =sc.nextLine();
		
		for(String w :words.split(" ")) {
			if(w.length()%2==0)
			{
				System.out.println(w);
			}
		}
		

	}

}
