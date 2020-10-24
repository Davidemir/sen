package com.class03;

public class Task3 {
	
	public static void main(String[] args) {
		
		/*
		 * Create a Java program and declare int variable that will hold a month. 
		 * Based on the value of the variable your program should print the name of the month. 
		 */
		
		int month=2;
		
		if(month==1) {
			System.out.println("January");
		}else if(month==2) {
			System.out.println("February");
		}else if(month==3) {
			System.out.println("March");
	    }else if(month==4) {
			System.out.println("April");
	    }else if(month==5) {
			System.out.println("May");
	    }else if(month==6) {
			System.out.println("June");
	    }else if(month==7) {
			System.out.println("July");
	    }else if(month==8) {
			System.out.println("August");
	    }else if(month==9) {
			System.out.println("September");
	    }else if(month==10) {
			System.out.println("October");
	    }else if(month==11) {
			System.out.println("November");
	    }else if(month==12) {
			System.out.println("December");
	    }else {
	    	System.out.println("monday");
	    }
		
		
		/*
		 * Write a program to check whether number is positive or negative. 
		 */
		
		int whether=27;
		
		if(whether<0) {
			System.out.println("Whether number is negative");
		}else if(whether==0) {
			System.out.println("Whether number is normal");
		}else {
			System.out.println("Whether number is positive");
		}
		
		/*Interview Question 
		 * 
		 *Write a Java Program to check whether number is Even or Odd.
		 */
		
		//not: even number examples: 0,2,4,6,100,450..
		// odd number: 1,3,5,7,9,13,21,215...
		
		int i=24;
		
		if(i%2==0) {
			System.out.println(i+" is an even number");	
		}else {
			System.out.println(i+" is an odd number");
		}
		
	}
}
