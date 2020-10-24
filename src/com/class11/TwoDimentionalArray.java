package com.class11;

public class TwoDimentionalArray {

	public static void main(String[] args) {

		/*
		 * ====2D(TWO DIMENTIONAL ARRAY)=====
		 * 
		 * In Java, multidimensional arrays are actually arrays of arrays. 
		 * It can have multiple rows and multiple columns (also known as matrix form) 
		 * unlike single dimensional array, which can have only one full row or one full column.
		 * Each element in the 2D array must be the same type
		 * To access all the items in a multidimensional array the technique is to use one loop inside of another.
 
		 * Syntax:
          Data_Type[][] Array_Name = new int[Row_Size][Column_Size];
          
          
          OR
          
          Data_Type[][] Array_Name = {
                         {[Row_Size][Column_Size]},
          };         
                         
		 */

		
		//Create 2D array;
		                     //row //cols
		int[] [] num = new int [4] [4];  //how many elements we have==>4*4=16 elements
		
	 //1. row
		num[0] [0] = 12;//meaning first row column 0;
		num[0] [1] = 13;//meaning first row column 1;
		num[0] [2] = 14;//meaning first row column 2;
		num[0] [3] = 15;//meaning first row column 3;
		
	 //2. row
		num[1] [0] = 1;//meaning second row column 0;
		num[1] [1] = 2;//meaning second row column 1;
		num[1] [2] = 3;//meaning second row column 2;
		num[1] [3] = 4;//meaning second row column 3;
		
		
	 //3. row
		num[2][0] = 5; //meaning third row column 0;
		num[2][1] = 10;//meaning third row column 1;
		num[2][2] = 15;//meaning third row column 2;
		num[2][3] = 20;//meaning third row column 3;
		
		
	 //4. row
		num[3][0] = 100;// meaning third row column 0;
		num[3][1] = 200;// meaning third row column 1;
		num[3][2] = 300;// meaning third row column 2;
		num[3][3] = 400;// meaning third row column 3;
		
		System.out.println(num[1] [2]);//meaning second row column 2;
		System.out.println(num[2] [3]);//meaning third row column 3;
		
		System.out.println("............................................");
		
		int[][] number = {
		// 1.row==> col 0, col 1, col 2  col 3
				{     12,    13,    14,   15 },

		// 2.row==> col 0, col 1, col 2  col 3
				{    1,     2,     3,     4 },

		// 3.row==> col 0, col 1, col 2  col 3
				{    5,     10,    15,   20 },

		// 4.row==> col 0, col 1, col 2  col 3
				{   100,   200,   300,  400 },
		};
		
		System.out.println(number[3] [1]);//meaning forth row column 1;
		System.out.println(number[0] [0]);//meaning first row column 0;
		
		System.out.println("............................................");
		
		String[] [] groups = {
	   // 1.row==> col 0,    col 1,   col 2    col 3    
				{ "Andrei", "Artem", "Julia", "Zoya"},
	  // 2.row==> col 0,    col 1,   col 2    col 3	   col 4
				{ "Baki", "Messi", "Ronaldo", "Sasha", "Toni"},
				
		};
		
		System.out.println(groups[0] [1]);//meaning first row column 1
		System.out.println(groups[0] [1]+" "+groups[1] [2]);//meaning first row column 1 + second row column 2;
	}	
	
}
	


