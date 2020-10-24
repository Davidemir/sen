package com.class02;

public class ModolusOperator {
	
	public static void main(String[] args) {
		
		float num1=12.5f;
		float num2=3.5f;
		
		float div=num1/num2;
		System.out.println(div);
		
		int number1=13;
		int number2=2;
		
		int div1=number1/number2;
		System.out.println(div1);
		
		double d=12;
		System.out.println(d);//for double result --> 12.0
		
		int a=15;
		int b=4;
		
		int reminder=a%b;
		System.out.println(reminder);
		
		//any arithmatic operator in java will follow precedence rule;
		//first paranthesis ( ) -->(5+6)
		//second div/mult
		//third sum/sub
		
		int myNumber=8+8*2;
		System.out.println(myNumber); 
		
		int myNumber1=(8+8)*2;
		System.out.println(myNumber1);
		
		int myNumber2=8+8%2;
		System.out.println(myNumber2);
	}

}
