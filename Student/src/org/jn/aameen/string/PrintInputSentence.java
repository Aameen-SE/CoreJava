package org.jn.aameen.string;

import java.util.Scanner;

public class PrintInputSentence {

	public static void main(String[] args) {
		// taking an input sentences and print it 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentences ");
		String line = sc.nextLine();
		
		System.out.println("Sentences : "+line);
	}

}
