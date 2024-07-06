package org.jn.aameen.array.flowcontrol;
import java.util.Scanner;
public class ConvertToLowercase {

	public static void main(String[] args) {
		// taking input and converting into lowercase
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to be converted into lowercase :");
		
		char c =sc.next().charAt(0);
		
		System.out.println(Character.toLowerCase(c));
	}

}
