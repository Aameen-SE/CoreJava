package org.jn.aameen.array;

import java.util.Arrays;

public class ColumnNoFixed {

	public static void main(String[] args) {
		// printing array which has no column fixed
		
		int[][]arr= {
				{1,2 ,3},
				{4 , 5},
				{6 , 7 , 8 , 9}
				
		};
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ; ");
				}
			System.out.println();
		}
		// using enhanced loop 
		System.out.println("\n Using enhanced loop \n");
		
		for(int[]a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		

	}

}
