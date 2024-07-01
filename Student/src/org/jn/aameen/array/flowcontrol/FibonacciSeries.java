package org.jn.aameen.array.flowcontrol;
import java.util.Scanner;


public class FibonacciSeries {

	public static void main(String[] args) {
		// Print the Fibonacci series up to a given number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num to find the fibonacci series upto that ");
		int num =sc.nextInt();
		int Series=0;
		int a = 0;
		int b =1;
		System.out.print(a +" ," + b+" ,");
		for(int i=1;i<=num;i++)
		{
			Series =a+b;
			System.out.print(Series +" ," );
			a=b;
			b=Series;
		}
		
	}

}
