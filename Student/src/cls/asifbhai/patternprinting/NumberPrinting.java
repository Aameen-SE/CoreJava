package cls.asifbhai.patternprinting;

import java.util.Scanner;

public class NumberPrinting {

	public static void main(String[] args) {
		
						// Number Printing 
						/* 1
						 * 12
						 * 123
						 * 1234  
						 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be printed : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
