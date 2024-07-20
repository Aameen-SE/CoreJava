package org.jn.aameen.array;

public class TryCatchExample {

	public static void main(String[] args) {
		// Exception handling using try and catch 
		
		int[] marks = {98 , 99 , 87};
		
		try {
			System.out.println(marks[5]);
		}catch (Exception exception) {
			// if in case you want to write condition after catching exception
		}
		
		System.out.println("Exception handling is done successfully ");
	}

}
