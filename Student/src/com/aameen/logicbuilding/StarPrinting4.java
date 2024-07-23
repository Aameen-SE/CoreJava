package com.aameen.logicbuilding;

public class StarPrinting4 {

	public static void main(String[] args) {
										/*Star Pattern 4
								
								         * 
								
								       * * 
								
								     * * * 
								
								   * * * * 
								
								 * * * * *   */
		
		
		
		
		
		int n=6;
		int i, j;

		for (i = 0; i < n; i++) {  

		for (j = 2 * (n - i); j >= 0; j--) { 

		System.out.print(" "); 

		} 

		for (j = 0; j <= i; j++) { 

		System.out.print("* "); 

		}

		System.out.println();

		}
		

		}
	
	
		
		
		
		

	}


