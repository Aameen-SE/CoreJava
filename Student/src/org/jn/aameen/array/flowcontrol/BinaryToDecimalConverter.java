package org.jn.aameen.array.flowcontrol;

import java.util.Scanner;

public class BinaryToDecimalConverter {

	public static void main(String[] args) {
		// Convert a binary number to decimal
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the binary number :");
		String binary = sc.next();
		
		int decimal =0;
		for(int i =0; i<binary.length();i++)
		{
			if (binary.charAt(binary.length() - 1 - i) == '1') {
                decimal += Math.pow(2, i);
            }
		}
        System.out.println("The decimal equivalent of binary " + binary + " is: " + decimal);


	}

}
