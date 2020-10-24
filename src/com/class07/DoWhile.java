package com.class07;

public class DoWhile {
	
	/*====== DO WHILE =======
	 * 
	 * do while is similar to while loop. 
	 * Code will execute while condition is true
	 * EVEN IF CONDITION IS FALSE CODE WILL GET EXECUTES AT LEAST ONCE
	 */
	
	
	/*
	 * ========= WHAT IS THE DIFFERENCE WHILE LOOP BETWEEN DO WHILE LOOP =========
	 * 
	 * while loop ==> first check the condition if condition is true and then
	 * perform the action. if condition is false, it will not execute.
	 * 
	 * while syntax=
	 * int num=10;//1. initialize variable
	 * while (num<=7){// 2. check condition
	 *     System.out.println("Hello");//3. execute code 
	 *     num1++;//4 increment }
	 * 
	 * 
	 * 
	 * 
	 * do while ==> first perform the action and then we are testing the condition.
	 * EVEN IF CONDITION IS FALSE CODE WILL GET EXECUTES AT LEAST ONCE
	 * 
	 * do while syntax=
	 * 
	 * int num1=10;//1. initialize variable 
	 * do { 
	 *     System.out.println("Bye");//execute code 
	 *     num1++;//increment 
	 *     }while(num1<=7);//check condition
	 * 
	 */
	
	//NOT: While==> mostly used
	 // do while==>rarely used
	public static void main(String[] args) {
		System.out.println("......While Loop (condition is true example).....");
		
		int num=1;
		
		while(num<=7) {//true
			System.out.println("Hello");
			num++;
		}
		
		
		System.out.println("......Do While Loop (condition is true example).....");
		
		int num1=1;
		
		do {
			System.out.println("Bye");
			num1++;
		}while(num1<=7);//true
		
		
		
       System.out.println("......While Loop (condition is false example).....");
		
		int num2=10;
		
		while(num2<=7) {//false
			System.out.println("Hello");
			num2++;
		}
		
		
		System.out.println("......Do While Loop (condition is false example).....");
		
		int num3=10;
		
		do {
			System.out.println("Bye");
			num3++;
		}while(num3<=7);//false
		
		System.out.println("How to print EVEN NUMBERS from 20 from 50 using do while");
		
		System.out.println("..FIRST WAY...");
		int even=20;
		
		do {
			System.out.println(even);
			even+=2;
		}while(even<=50);
			
		System.out.println("..SECOND WAY...");
		
		int even1=20;
		
		do {
			
			if(even1%2==0) {
				System.out.println(even1);
			}
			even1++;
		}while(even1<=50);
		}
	}

