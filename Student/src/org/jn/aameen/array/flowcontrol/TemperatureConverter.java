package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// Write a program to convert temperature from Celsius to Fahrenheit and vice versa
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Temperature Converter ");
			System.out.println("Option 1 : Convert Celsius to Fahrenheit");
			System.out.println("Option 2 : Convert Fahremheit to Celsius");
			System.out.print("Choose the option :");
			
			int option = sc.nextInt();
			
			double temperature ;
			double convertTemp;
			
			switch(option) {
			case 1:
				System.out.print("Enter the temperature in Celsius :");
				temperature =sc.nextDouble();
				convertTemp= CtoF(temperature);
				System.out.println("Celsius :"+temperature +"converted to Fahrenheit :"+convertTemp);
				break;
			
			case 2:
				System.out.print("Enter the temperature in Fahrenheit:");
				temperature =sc.nextDouble();
				convertTemp= FtoC(temperature);
				System.out.println("Fahrenheit :"+temperature +"converted to Celsius :"+convertTemp);
				break;
			}
	}

	 static double FtoC(double fahrenheit) {
		
		return (fahrenheit - 32) * 5/9;
	}

	 static double CtoF(double celsius) {
		
		return (celsius * 9/5) + 32;
	}

}
