package org.jn.aameen.method;

import java.util.Scanner;

public class BinaryDecimalConvert {

	public static void main(String[] args) {
		// Convert a binary number to decimal
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the binary number :");
		String binary = sc.next();
		
		int decimal = binarydecimal(binary);
		System.out.println("Binary :"+binary +" ; Decimal of binary :"+decimal);
		
		
		
		
	}
	
	static int binarydecimal(String binary)
	{
		int decimal =0;
		int length = binary.length();
		
		for(int i=0;i<length;i++) {
			 if (binary.charAt(length - 1 - i) == '1') {
	                decimal += Math.pow(2, i);
	            }
		}
		return decimal;
	}

}
