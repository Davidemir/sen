package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		
		int[][] num={
  // 1.row==> col 0,    col 1,   col 2    col 3  
				{ 11,    12,       13,     14},
  // 2.row==> col 0,    col 1,   col 2    
				{ 21,    22,       23},
   // 3.row==> col 0,    col 1,   col 2    col 3 
				{ 31,    32,       33,     44 },
		};
		
		//how many rows we have?
		int rows=num.length;
		System.out.println(rows);
		
		
		// inside the FIRST row how many columns we have?
		int cols = num[0].length;
		System.out.println(cols);

		// inside the SECOND row how many columns we have?
		int colss = num[1].length;
		System.out.println(colss);

		// inside the THIRD row how many columns we have?
		int colS = num[2].length;
		System.out.println(colS);
		
		System.out.println("......................");
		
		for (int row=0; row<num.length; row++) {//for each row
			
			for (int col=0; col<num[row].length; col++) {//for each col
				
			System.out.print(num[row][col]+" ");
		    }
			System.out.println();
	    }
		
		
	
		System.out.println("..........................");
		
		   
		String[][] food = { 
				{ "burger", "fries", "hot dog", "meat loaf"},
				{ "kebap", "lahmacun", "iskender" },
				{ "bryani", "naan", "korma", "chick peas"},
		};
		
		System.out.println(" first way with for loop");
		
		for (int i=0; i<food.length; i++) {
			
			for (int j=0; j<food[i].length; j++) {//for each row
				
				System.out.print(food[i] [j]+" ");//for each col
			}
			System.out.println();
		}
		System.out.println(".................");
		System.out.println(" second way with for enhanced loop");
		
		for (String [] meal: food) {

			for (String eat : meal) {
				System.out.print(eat + " ");
			}
			System.out.println();
		}
		
	}
}
