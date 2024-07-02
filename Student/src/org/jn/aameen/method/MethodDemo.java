package org.jn.aameen.method;
import java.util.Scanner;
public class MethodDemo {

	public static void main(String[] args) {
		// calling a Method without returning  
		//sum();
		
		// calling a return type method 
		//System.out.println(sum1());
		
		// pass the value of a number when you are calling a method 
		
		System.out.println("Sum3 : "+sum3(20,30));

	}
	
	static int sum3(int a , int b) {
		
		int sum = a+b;
		return sum;
	}
	
	
	static int sum1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 = sc.nextInt();
		
		return num1+num2;
		
	}
	static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		System.out.print("sum of two number : "+sum);
				
	}

}
