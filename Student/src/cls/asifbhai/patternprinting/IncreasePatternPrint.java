package cls.asifbhai.patternprinting;

import java.util.Scanner;

public class IncreasePatternPrint {

	public static void main(String[] args) {
		
		
					// Pattern Printing
					/*			*
					 * 			**
					 * 			***
					 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of Star to Print :");
		int num = sc.nextInt();
		
		for(int i =1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
