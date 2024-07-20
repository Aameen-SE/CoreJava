package com.aameen.switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		//Write a program that takes two numbers and an 
		//operator (+, -, *, /) as input and performs the corresponding operation.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num :");
		int num1=sc.nextInt();
		System.out.println("Enter the second num :");
		int num2=sc.nextInt();
		
		System.out.println("Enter the operator to be used + , - , * ,/ ");
		char c=sc.next().charAt(0);
		int result;
		
		switch (c) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero is not allowed.");
                return; 
            }
            break;
        default:
            System.out.println("Error! Invalid operator.");
            return; 
    }
		
		System.out.println("The result is: " + result);
		
	}

}