package com.class07;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		/*
	       * Using scanner class create calculator.
	       * Allow user to enter 2 numbers and operator(+,-,*,/).
	       * Based on operator provide the result to user.
	       */
		
    Scanner scan=new Scanner(System.in);
    int num1, num2,  total=0;
    char op;
    
    System.out.println("Please enter first number");
    num1= scan.nextInt();
    System.out.println("Please enter operator");
    op=scan.next().charAt(0);
    System.out.println("Please enter the second number");
    num2= scan.nextInt();
     
    switch (op) {
    
    case '*':
    	total=num1*num2;
    	break;
    case '/':
    	total=num1/num2;
    	break;
    case '+':
    	total=num1+num2;
    	break;
    case '-':
    	total=num1-num2;
    default:
    	System.out.println("Wrong operator");
    }
	System.out.println(total);
	
    }
				
	}


