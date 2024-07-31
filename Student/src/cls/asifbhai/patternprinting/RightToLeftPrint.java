package cls.asifbhai.patternprinting;

public class RightToLeftPrint {

	public static void main(String[] args) {
		
						// Right to left printing 
						/* 
						 *				*
						 *			   ** 
						 * 			  ***
						 * 
						 */
		
		int num = 5;
		
		for(int i=1;i<=num;i++)
		{
			for(int space=1;space<=num-i;space++)
			{
				System.out.print(" ");
			}
			
			for(int star=1;star<=i;star++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
