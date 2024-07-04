package org.jn.aameen.array;
import java.util.Arrays;
public class ArrayAscendingOrder {

	public static void main(String[] args) {
		// Sort an array in ascending order.
		
		int[] array = new int[] { -5, -9, 8, 12, 1, 3 };
		
		System.out.print("Original array : ");
		 for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
		 Arrays.sort(array);
		 
		 System.out.println();
		 System.out.print("After sorting array in ascending : "+ Arrays.toString(array));

	}

}
