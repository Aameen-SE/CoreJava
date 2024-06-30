package org.jn.aameen.array;
import java.util.Arrays;

public class SortNumericandString {

	public static void main(String[] args) {
		// Write a Java program to sort a numeric array and a string array.
		
	int [] array1 = {
			78 , 89 , 90 , 
			100 , 45 , 36 ,
			12 , 10 , 5
	};
	
	String [] array2 = {
			"Java" , "SpringBoot" , "HTML" ,
			"Netbeans" , "Javascript" , "Cloud" ,
			"Python" , "Ruby" , "Css"
	};
	
	System.out.println("Original numeric arrays :" +Arrays.toString(array1));
	
	Arrays.sort(array1);
	
	System.out.println("After sorting :"+Arrays.toString(array1));
	
	System.out.println("Orginal Strig Arrays :"+Arrays.toString(array2));
	
	Arrays.sort(array2);
	
	System.out.println("After Sorting : "+Arrays.toString(array2));

	}

}
