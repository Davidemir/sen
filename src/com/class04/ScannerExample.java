package com.class04;

import java.util.Scanner;

public class ScannerExample{
	
	public static void main(String[] args) {
		
		/*
		 * anyName(scan),we create the Object(new Scanner-->it is type of Scanner)
		 * dont forget the import Scanner
		 * (System.in)-->which put would u like to input.-->I would like to input from keyword.
		 * when u want to sth write in console and click on enter.
		 * 
		 * nextInt();  -->for numbers
		 * nextLine() ; -->Strings
		 * nextDouble();-->double
		 * ....
		 */
	  
		Scanner scan=new Scanner(System.in);//first we write scanner
		System.out.println("Please enter any number");//second write sout
		int number=scan.nextInt();//and the write data type
		System.out.println("Entered number is "+number);
		
		System.out.println("*************************");
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good afternoon "+name);
		
	}

}
