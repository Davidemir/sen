package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	
	public static void main(String[] args) {
		
		/*
		 * ask user to enter name 5 times 
		 * and our output should be "Good afternoon___"
		 */
		
		//first it will give 5 times good morning+name;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		
		int i=5;
		
		while(i<10) {
			
			
			System.out.println("Good afternoon "+name);
			i++;
		}
		
		
		System.out.println("*****************************************8");
		
		//second u will enter name and the it will say good morning+name
		//it will continue 5 times.name will be by one by 5 times.
		Scanner scan1=new Scanner(System.in);
		
		
		int i1=5;
		
		while(i1<10) {
			
			System.out.println("Please enter your name");
			String name1=scan1.nextLine();
			System.out.println("Good afternoon "+name1);
			i1++;
		}
		
	}

}
