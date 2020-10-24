package com.class09;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("************first way***************************");
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the start number");
		int num1=scan.nextInt();
	
		System.out.println("Please enter the end number");
		int num2=scan.nextInt();
		
		int start=0;
		int end=0;
		
		
		
        
		if(num1<num2) {
			start=num1;
			end=num2;
			
		}else {
			start=num2;
			end=num1;
		}
		
		
		int even=0;
		int odd=0;
		         
		/*
		 * if we say start=20; end=30; there is NO ISSUE coz 20<=30; but
		 *  but if we say we say start=20; end=10; there IS ISSUE COZ 20<=10 is wrong and
		 *  system will not executed therefore we add the if condition.
		 */
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
			}
		}
		System.out.println("The sum of even numbers are "+even);
		System.out.println("The sum of odd numbers are "+odd);
		
		
		System.out.println("************second way***************************");
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter start number");
		int start1=scan1.nextInt();
		System.out.println("Enter ending number");
		int end1=scan1.nextInt();
		
		int even1 =0;
		int odd1=0;
		
		if(start1< end1) {
			for(int i=start1; i<=end1; i++) {
				if(i%2==0) {
					even1=even1+i;
			}
			else { //firstNumber> secondNumber
				    odd1=odd1+i;
				}
				
			}
		}else {//if num1>num2
			System.out.println("Please enter start number less than end number");
			}
		System.out.println("The sum of even numbers is " +even1);
			System.out.println("The sum of even numbers is " +odd1);
		
		
		System.out.println("***WE DONT THE NUMBER THEREFORE WE USE DO WHILE LOOP*************************************");
		
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he ям?nds the correct number. When the correct answer is
		 * found the system should display "Congratulations!!. You got it!"
		 */
		
		Scanner input;
		int secretNumber, guessNumber;
		
		input=new Scanner(System.in);
		secretNumber=12;
	
		do {
			System.out.println("Please guess my number 1 to 20");
			guessNumber=input.nextInt();
			
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is too small");
			
		    }else {
		    	System.out.println("Congratulations!!. You got it!");
		    }
		}while(guessNumber!=secretNumber);
	}
}


