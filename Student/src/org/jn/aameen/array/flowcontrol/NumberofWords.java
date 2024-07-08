package org.jn.aameen.array.flowcontrol;
import java.util.Scanner;
public class NumberofWords {

	public static void main(String[] args) {
		// Count the number of words in a string.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name :");
			
		String name = sc.nextLine();
		
		int wordcount = countWords(name);
		
		System.out.println(wordcount);
		
		
	}
	
	 public static int countWords(String input) {
	        if (input == null || input.isEmpty()) {
	            return 0;
	        }

	        String[] words = input.trim().split("\\s+");
	        return words.length;
	    }
	

}
