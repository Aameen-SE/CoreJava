package com.aameen.switchcase;
import java.util.Scanner;
public class DayofWeek {

	public static void main(String[] args) {

		// Write a program that takes a number (1-7) as input and prints the corresponding day of the week 
			//(e.g., 1 for Sunday, 2 for Monday, etc.).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1-7:");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("Sunday");
			break;
		case 2: 
			System.out.println("Monday");
			break;
		case 3: 
			System.out.println("Tuesday");
			break;
		case 4: 
			System.out.println("Wednesday");
			break;
		case 5: 
			System.out.println("Thursday");
			break;
		case 6: 
			System.out.println("Friday");
			break;
		case 7: 
			System.out.println("Saturday");
			break;
			
		default : 
			System.out.println("Enter the number from between 1-7");
		}
	}

}
