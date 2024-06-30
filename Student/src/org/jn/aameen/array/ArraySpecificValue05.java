package org.jn.aameen.array;

public class ArraySpecificValue05 {
	
	public static void main(String[] args) {
		// Write a Java program to test if an array contains a specific value.
		
		int [] array = new int[] {22646 , 456612 , 2021 , 203245 ,
				23654, 24516 , 2024, 202365 , 2145 };
		
		System.out.println(contains(array,2021));
		System.out.println(contains(array,2016));
		
	}
	
	public static boolean contains(int[]arr , int item)
	{
		for(int n:arr)
		{
			if(item==n)
				return true;
		}
		return false;
	}
	
	
	
}
