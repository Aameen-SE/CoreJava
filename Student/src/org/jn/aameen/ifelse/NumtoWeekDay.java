package org.jn.aameen.ifelse;

import java.util.Scanner;

public class NumtoWeekDay {

	public static void main(String[] args) {
		// Write a program to input week number and print week day
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week number ");
		int weeknum=sc.nextInt();
		if(weeknum==1)
			System.out.println("Sunday ");
		else if(weeknum==2)
			System.out.println("Monday");
		else if(weeknum==3)
			System.out.println("Tuesday");
		else if(weeknum==4)
			System.out.println("Wednesday");
		else if(weeknum==5)
			System.out.println("Thursday");
		else if(weeknum==6)
			System.out.println("Friday");
		else if(weeknum==7)
			System.out.println("Saturday");
		else
			System.out.println("There is no such week day allocated to that number");
		

	}

}
