package cls.asifbhai.patternprinting;

import java.util.Scanner;

public class NumPrint2 {

	public static void main(String[] args) {
		
					// Number Printing
					/*	1
					 *  22
					 *  333
					 *  4444
					 * 	55555
					 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be printed upto :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}

	}

}
