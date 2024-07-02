package org.jn.aameen.method;

import java.util.Scanner;

public class PrimeMethod {

	public static void main(String[] args) {
		// Prime number in a method using while loop
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		//Prime(num);
		//boolean ans =isPrime(num);
		//System.out.println("isPrime : "+ans);
		PrimeorNot(num);
	}
	
	static void PrimeorNot(int n) {
		for(int i=2;i>=n;i++) {
			if(n%i!=0)
				System.out.println(i+";");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void Prime(int n) {
		if(n<=2)
		{
			System.out.println("isPrime");
		}
		
		else if(n%2==0) {
			System.out.println("NotPrime");
		}
		else
			System.out.println("isPrime");
		
	}
	static boolean isPrime(int n) {
		
	if(n<=2)
		{
			return true;
		}
	return n%2!=0;
	
	//	else if(n%2==0)
		//	return false;
	//	else 
		//	return true;
	}

}
