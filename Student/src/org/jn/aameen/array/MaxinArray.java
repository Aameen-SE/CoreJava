package org.jn.aameen.array;

public class MaxinArray {

	public static void main(String[] args) {
		// Max in array 
		
		int [] arr = {1, 2, 3, 4, 89, 79, 67 };
		System.out.println(max(arr));
		
	}		
		static int max(int[] arr) {
			
			int maxval = arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>maxval)
					maxval=arr[i];
			}
			
			return maxval;
		}

}
