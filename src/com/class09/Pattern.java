package com.class09;

public class Pattern {

	public static void main(String[] args) {
		
		System.out.println("long way");
		
		//*****
		for (int i=1; i<=5; i++) {
			
				System.out.print("*");
			
		}
		
		System.out.println();//we use for empty line
		


		
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		System.out.println("short way");
		
		//column   column      column       column          column(5)
		// *            *            *            *              * ==>row(4)
		// *****==>row
		// *****==>row
		// *****==>row
		
		for (int row=1; row<=4; row++) {
			
			for (int column=1; column<=5; column++) {
				
				System.out.print("*");
			}
			System.out.println();//if u dont write empty line, execute will be all in one line
			//but when u use the empty line it will be by one by line.
		}	
		
		
		
		    System.out.println("............................");
		    
		    //column(7)
		  //********
		  //********row(5)
		  //********
		  //********
		  //********
			
		    for (int r=0; r<5; r++) {//rows
		    	
		    	for (int c=0; c<7; c++) {//columns
		    		
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    
		    
		    System.out.println("............................");
		    
		    /*print
		     * 
		     * column(5)
		     * 12345
		     * 12345=row(4)
		     * 12345
		     * 12345
		     */
		    
		    for (int r=1; r<=4; r++) {
		    	
		    	for (int c=1; c<=5; c++) {
		    		
		    		System.out.print(c);
		    	}
		    	System.out.println();
		    }
		
		    
		    System.out.println("............................");
		    
		    /*
		 * print
		 * 
		 * column(5)
		 * 11111 
		 * 22222 row(4)
		 * 33333 
		 * 44444
		 * 
		 * 
		 * 
		 */
		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= 5; c++) {

				System.out.print(r);
			}
			System.out.println();
		}
		
		
		 System.out.println("............................");
		    
		    /*print
		     * 
		     * column(9)
		     * 123456789
		     * 123456789 row(5)
		     * 123456789
		     * 123456789
		     * 123456789
		     */
		 
		 for (int r=1; r<=5; r++) {
			 
			 for (int c=1; c<=9; c++) {
				 
				 System.out.print(c);
			 }
			 System.out.println();
		 }
		 
		 System.out.println(".........decrement...................");
		 
		 /*print
		  * 
		  * column(5)
		  * 54321
		  * 54321 row(5)
		  * 54321
		  * 54321
		  * 54321
		  */
		 System.out.println("first way"); 
		 
		 for (int r=5; r>=1; r--) {//we will print column therefore we can use decrement/ increment
             //for row it is not important. System only care the columns

			 
			 for (int c=5; c>=1; c--) {
				 
				 System.out.print(c);
			 }
			 System.out.println();
		 }
		 
		 
		 System.out.println("second way");
		 
			for (int r = 1; r <= 5; r++) {//we will print column therefore we can use increment/decrement
				                           //for row it is not important. System only care the columns

				for (int c = 5; c >= 1; c--) {

					System.out.print(c);
				}
				System.out.println();
			}
		 
		 System.out.println("..........decrement..................");
		 
		 /*print
		  * 
		  * column(5)
		  * 55555
		  * 44444 row(5)
		  * 33333
		  * 22222
		  * 11111
		  */
		 
		 System.out.println("first way");
		 for (int r=5; r>=1; r--) {
			 
			 for (int c=5; c>=1; c--) {//we will print rows therefore we can use decrement/increment
                 //for columns it is not important. System only care the rows
				 
				 System.out.print(r);
			 }
			 System.out.println();
		 }
		 
		 System.out.println("second way");
		 
		for (int r = 5; r >= 1; r--) {

			for (int c=1; c<=5; c++) {//we will print rows therefore we can use increment/decrement
                //for columns it is not important. System only care the rows

				System.out.print(r);
			}
			System.out.println();
		}
	}

}
