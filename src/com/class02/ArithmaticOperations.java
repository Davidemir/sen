package com.class02;

public class ArithmaticOperations {
	
	public static void main(String[] args) {
		
	/*
	 * declare 2 variables and initialize them
	 * display result of addition, subtraction, multiplication and division
	 */
	
		int num1,num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		//how can we print value of num1 and num2 together-->(20 10)
		System.out.println(num1+" "+num2);
		
		System.out.println("-------------------------");
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
	}

}
