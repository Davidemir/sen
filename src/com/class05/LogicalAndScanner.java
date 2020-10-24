package com.class05;

import java.util.Scanner;

public class LogicalAndScanner {
	
	public static void main(String[] args) {
		
		/*
		 * ask user to enter age
		 * if age is from 1 to 3--> u are a baby
		 * if age is from 3 to 5--> u are a toddler
		 * if age is from 5 to 12--> u are a kid
		 * if age is from 12 to 19--> u are a teenager
		 * if age >20 --> u are an adult
		 */
		
		//1 to 3-->meaning 1 from  3 (1,2,3).therefore we must use And(&&) not or(||).
		
		
		//FIRST WAY 
		
		int age;
		Scanner input;
		
		input=new Scanner(System.in);
		System.out.println("Please enter the age!!");
		age=input.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println("You are a baby");
		}else if(age>3 && age<=5) {
			System.out.println("You are a toddler");
		}else if(age>5 && age<=12) {
			System.out.println("You are kid");
		}else if(age>12 && age<=19) {
			System.out.println("You are teenager");
		}else if(age>=20) {
			System.out.println("You are an adult");
		}else {
			System.out.println("Entered invalid age");
		}
		
		
		//SECOND WAY
		
		Scanner input1=new Scanner(System.in);
		System.out.println("Please enter the age!!");
		int age1=input1.nextInt();
		
        String human;
		
		if(age1>=1 && age1<=3) {
			human="baby";
		}else if(age1>3 && age1<=5) {
			human="toddler";
		}else if(age1>5 && age1<=12) {
			human="kid";
		}else if(age1>12 && age1<=19) {
			human="teenager";
		}else if(age1>=20) {
			human="adult";
		}else {
			human="unknown";
		}
		
		System.out.println("You are "+human);
		//not: if u dont System.out.println("You are "+human); the system will not work.
		//system work with sout..
	}

}
