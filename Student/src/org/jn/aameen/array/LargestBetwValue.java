package org.jn.aameen.array;

public class LargestBetwValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1, 2, 303, 4, 89, 79, 67 };
		System.out.println(maxRange(arr , 2, 4));
	}
	
		static int maxRange(int[] arr , int start , int end) {
			
			int maxval=start;
			
			for(int i=start;i<=end;i++)
			{
				if(arr[i]>maxval)
					maxval=arr[i];
			}
			
			return maxval;
		}

}
