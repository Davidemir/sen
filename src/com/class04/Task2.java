package com.class04;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		//------------SCANNER QUESTIONS-----------
		/*
		 * You are a loan specialist and you need to ASK USER what is the amount of loan is needed. 
		 * If loan is less than 200,000 then you would lend the money
		 * otherwise you would reject the client. 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("What is the amount of loan is needed?");
		int loan=input.nextInt();
		
		if(loan<200000) {
			System.out.println("I would lend the money");
		}else {
			System.out.println("I would reject the client");
		}
		
		
		/*
		 * You are DMV representative and you need to ASK CUSTOMER their age. 
		 * If they are 18 and older you will issue a driver licence to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		System.out.println("*************************");
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your age?");
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("You can get driver licence");
		}else {
			System.out.println("You can get learners permit");
		}
		
		System.out.println("******************************");
		
		/*
		 * Create a Java program that will ask user to input city and temperature.
		 * Your program should convert Fahrenheit into celsius 
		 * and print “The temperature is the city __ is __”
		 */
		Scanner keyword=new Scanner(System.in);
		System.out.println("What is your city name?");
		String city=keyword.next();
		
		System.out.println("What is the temparature");
		int temp=keyword.nextInt();
		
		int convertedTemp=(temp-32)*5/9;//--> to convert Fahr TO C
		
		System.out.println("The temperature is the city "+city+" is "+convertedTemp);
		

		System.out.println("******************************");
		/*
		 * Create a Java program that will ASK if USER has a credit card or not.
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately,
		 * otherwise you can tell them that they can spend more.
		 */
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false?");
		boolean card=scan1.nextBoolean();
		
	  if(card) {
			System.out.println("What is the balance on your the card? ");
		    int balance=scan1.nextInt();
		
		    if(balance>1000) {
			System.out.println("You must pay off immediately");
		    }else {
			System.out.println("You can spend more");
		    }
		
	  }else {
		   System.out.println("Would u like to apply for credit card?");
	  }
	  

		System.out.println("******************************");
		
		/*
		 * Write a program to ASK USER to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not.
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 * otherwise bonus=3000.
		 */
		
		Scanner input1=new Scanner(System.in);
		System.out.println("How many years you worked?");
		int year=input1.nextInt();
		
		if(year>=5) {
			System.out.println("You are eligible for bonus");
			
			System.out.println("What is your annual salary?");
			int salary=input1.nextInt();
			
			if(salary>50000) {
				System.out.println("The bonus is 5000");
			}else {
				System.out.println("The bonus is 3000");
			}
		}else {
			System.out.println("You are NOT eligible for bonus");
		
		}
	}
}
