package org.jn.aameen.array;

public class AvgofArrayElement04 {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements.
		
		int [] number = new int[] {12,15,45,60};
		int sum=0;
		
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		
		System.out.println("sum of the array :"+sum);
		
		double avg = sum/number.length;
		System.out.println("Average value of array elements :"+avg);

	}

}
