package com.class03;

public class EvenAndOddNumber {
	
	public static void main(String[] args) {
		
		/*
		 * not: even number: 0,2,4,6,100,450..
		 *      odd number: 1,3,5,7,9,13,21,215...
		 */
	    
		int num=34;
		
		if(num%2==0) {
			System.out.println(num+" is an even number");
		}else {
			System.out.println(num+" is an odd number");
		}
		
		
		int num1=33;
		
		if(num1%2!=1) {// or if(num1%2==1){
			System.out.println(num1+" is an odd number");
		}else {
			System.out.println(num1+ " is an even number");
		}
	}

}
