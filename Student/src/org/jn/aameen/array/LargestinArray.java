package org.jn.aameen.array;



public class LargestinArray {

	public static void main(String[] args) {
		// Find the  largest number in an array.
		
		int [] arr = {123,145,524,234};
			
			if(arr[0]>arr[1]&&arr[0]>arr[2]&&arr[0]>arr[3])
				System.out.println("arr[0] : "+arr[0]);
			
			else if(arr[1]>arr[0]&&arr[1]>arr[2]&&arr[1]>arr[3])
				System.out.println("arr[1] : "+arr[1]);
			
			else if(arr[2]>arr[0]&&arr[2]>arr[1]&&arr[2]>arr[3])
				System.out.println("arr[2] : "+arr[2]);
			
			else
				System.out.println("arr[3] : "+arr[3]);
				
			
	}

}
