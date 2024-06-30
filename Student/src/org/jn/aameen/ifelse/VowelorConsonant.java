package org.jn.aameen.ifelse;

import java.util.Scanner;


public class VowelorConsonant {

	public static void main(String[] args) {
		// Write a program to input any alphabet and check whether it is vowel or consonant
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet :");
		char alpha =sc.next().charAt(0);
		
		if(alpha=='a'|| alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u' || alpha=='A'|| alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
			System.out.println("The input alphabet is vowel , alpha : "+alpha);
		else
			System.out.println("The input alphabet is consonant , alpha : "+alpha);

	}

}
