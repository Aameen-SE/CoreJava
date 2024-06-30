package org.jn.aameen.array;
import java.util.Arrays;
public class SumofArray {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array.
		int sum=0;
		int [] array = {12 ,35,45,80};
		System.out.println("Values of array to be added : "+Arrays.toString(array)+"\n");
		
		for(int i : array)
		{
			sum = sum+i;
		}
		System.out.println("Sum of the above array is "+sum);
	}

}
