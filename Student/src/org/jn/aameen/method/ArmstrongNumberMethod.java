package org.jn.aameen.method;

import java.util.Scanner;

public class ArmstrongNumberMethod {

	public static void main(String[] args) {
		// Armstrong number using method 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		Armstrong(num);
	}
	static void Armstrong(int n) {
		int sum =0,original=n;
		while(n>0)
		{
			int rem = n%10;
			int cube = rem*rem*rem;
			sum=sum+cube;
			n=n/10;
			
		}
		System.out.println(sum);
	if(sum==original)
		System.out.println(" is an Armstrong number ");
		else
		System.out.println(" is not an Armstrong number ");
			
	}

}
