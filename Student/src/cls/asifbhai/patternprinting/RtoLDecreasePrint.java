package cls.asifbhai.patternprinting;

public class RtoLDecreasePrint {

	public static void main(String[] args) {
		// right to left decrease printing
		/*
		 * 		*****
		 * 		 ****
		 * 		  ***
		 */
		
		int num=3;
		
		for(int i=1;i<=num;i++)
		{
			for(int space=1;space<i;space++)
			{
				System.out.print(" ");
			}
			
			for(int star=i;star<=num;star++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	

	}

}
