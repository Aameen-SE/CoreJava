package org.jn.aameen.ifelse;
import java.util.Scanner;
public class LeapYearorNot {

	public static void main(String[] args) {
		// Write a program to check whether a year is leap year or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year to be checked it  is leap year or not");
		
		int year = sc.nextInt();
		boolean flag = false;
		
		if(year%400==0)
			flag=true;
		else if(year%100==0)
			flag=false;
		else if(year%4==0)
			flag=true;
		else 
			flag=false;
		
		if(flag)
			System.out.println("The year entered is leap year , year: "+year);
		else 
			System.out.println("The year entered is not a leap year , year: "+year);
		
		

	}

}
