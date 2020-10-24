package com.class07;

import java.util.Scanner;

public class TheBestExampleOfWhileLoopAndDoWhileLoop {

	// important=If we don't know number of iterations WHILE loop /Do While loop is BEST choice for the loop
	
	public static void main(String[] args) {
		
		
		/*
		 * u need to ask user to pay for coffee 
		 * u need to keep asking user to pay for it
		 * until entered price is equal=5;
		 * After user paid then say "Enjoy your coffee!"
		 */
		
		
		
		//our variable based on user therefore we did not write increment.
		
		   System.out.println("...first way with Do While......");
		   
		Scanner scan=new Scanner(System.in);
		int price;
		
		do {
			System.out.println("Please pay for your coffee");
			price=scan.nextInt();
			
		}while(price!=5);
		    System.out.println("Enjoy your coffee!");
		    
		    
		    System.out.println("...second way with While......");
		    
		  
		  
		  int price1=1;
		  System.out.println("Please pay for your coffee");//it is for action
		  price1=scan.nextInt();//it is for action
		  
		  while(price1!=5) {
			  
			  System.out.println("Please pay for your coffee");//it is for increment
			  price1=scan.nextInt();//it is for increment
			  
		  }
		  
		  System.out.println("Enjoy your coffee!");
	}

}
