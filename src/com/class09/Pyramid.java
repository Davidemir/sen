package com.class09;

public class Pyramid {

	public static void main(String[] args) {
		 //column(5)
		// *
		// **  row(5)
		// ***
		// ****
		// *****
		
		
		//in this example columns dependecy of rows.the number of columns it can be less OR equal to rows BUT
		//it can not be greater than rows.

		for (int row=1; row<=5; row++) {
			
			for (int column=1; column<=row; column++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println(".....................");
		
		/*print
		 * 
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 666666
		 * 7777777
		 * 88888888
		 * 999999999
		 * 
		 * column=9
		 * row=9
		 */
		
		for (int r=1; r<=9; r++) {
			
			for (int c=1; c<=r; c++) {
				
				System.out.print(r);
			}
			System.out.println();
		}
	}

}
