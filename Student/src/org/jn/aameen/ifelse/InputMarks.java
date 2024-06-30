package org.jn.aameen.ifelse;

import java.util.Scanner;

public class InputMarks {

	public static void main(String[] args) {
		// Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
	/*	Percentage >= 90% : Grade A
		*		Percentage >= 80% : Grade B
		*		Percentage >= 70% : Grade C
		*		Percentage >= 60% : Grade D
		*		Percentage >= 40% : Grade E
			Percentage < 40% : Grade F*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of Physics");
		int phymarks =sc.nextInt();
		
		System.out.println("Enter the Marks of Chemistry");
		int Chemmarks =sc.nextInt();
		
		System.out.println("Enter the Marks of Biology");
		int biomarks =sc.nextInt();
		
		System.out.println("Enter the Marks of Mathematics");
		int Mathmarks =sc.nextInt();
		
		System.out.println("Enter the Marks of Computer");
		int Compmarks =sc.nextInt();
		
		
		int sum = (phymarks + Chemmarks +biomarks+Mathmarks+Compmarks);
		
		
		int percentage = sum/5;
		
		System.out.println("Percentage of the students :" +percentage);
		
		
		if (percentage >= 90) 
			System.out.println("Grade A");
		else if (percentage >= 80) 
			System.out.println("Grade B");
		else if (percentage >= 70) 
			System.out.println("Grade C");
		else if (percentage >= 60) 
			System.out.println("Grade D");
		else if (percentage >= 40) 
			System.out.println("Grade E");
		else  
			System.out.println("Grade F");
		
		
		
		
		
		
		

	}

}
