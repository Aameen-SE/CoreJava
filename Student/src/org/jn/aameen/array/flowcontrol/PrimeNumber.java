package org.jn.aameen.array.flowcontrol;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// Check if a number is a prime number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked is prime or not ");
		int num = sc.nextInt();
		
		if(num==0 || num==1 || num==2)
			System.out.println("Prime number , num :"+num);
		else if (num % 2 == 0) {
            	System.out.println("Not Prime");
            }
            else
            	System.out.println("Is Prime");
            
		
		
		
		

	}

}
