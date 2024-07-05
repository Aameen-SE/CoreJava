package org.jn.aameen.array;

import java.util.Scanner;
import java.util.Arrays;


public class Input2dArray {

	public static void main(String[] args) {
		// input of 2D Array;
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int [3][3];
		System.out.println("Enter the array :");
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col =0;col<arr[row].length;col++)
			{
				arr[row][col]=sc.nextInt();
				
				}
		}
		
		//output

		for(int row=0;row<arr.length;row++)
		{
			for(int col =0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" , ");
				
				}
			System.out.println();
		}
		
		
		
		// output 
		for(int row=0;row<arr.length;row++)
		{
			System.out.println(Arrays.toString(arr[row]));
		}
		
		
		// using enhanced for loop
		
		for(int[]a :arr)
			System.out.println(Arrays.toString(a));
		

	}

}
