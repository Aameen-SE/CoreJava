package org.jn.aameen.array;

import java.util.Arrays;
import java.util.Scanner;

public class InputValueArray {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int arr[]=new int[5];
		
		
		
		
		
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			}
		System.out.println(Arrays.toString(arr));
		
		/*for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i] +",");
			
		} */
	

	}

}
