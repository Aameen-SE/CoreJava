package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class VowelsinString {

	public static void main(String[] args) {
		// Count the number of vowels in a string.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		
				
		
		
		String name = sc.next();
		name=name.toLowerCase();
		
		int count=0;
		
		for(int i =0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'|| name.charAt(i)=='e'||
					name.charAt(i)=='i'||name.charAt(i)=='o'|| name.charAt(i)=='u') {
				
				count++;
			}
		}
		
		System.out.println("Number of vowels in a string ; count :"+count);
		

	}

}
