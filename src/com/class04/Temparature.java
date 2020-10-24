package com.class04;

import java.util.Scanner;

public class Temparature {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your city");
		String city=scan.next();
		
		System.out.println("Please enter temparature");
		int temp=scan.nextInt();
		
		
		
		int convertedTemp=(temp-32)*5/9;//--> to convert Fahr TO C
		System.out.println("The temparature in city "+city+" is "+convertedTemp);
	}

}
