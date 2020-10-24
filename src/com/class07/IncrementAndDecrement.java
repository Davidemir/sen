package com.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		System.out.println("*****Increment Operator*****");
		//first way
		int a=10;
		a=a+1;//==>regular assignment
		System.out.println(a);
		
		
		//second way
		int b=10;
		b+=1; //==>shorthand assignment
		System.out.println(b);
		
		
		//third way
		int c=10;
		c++; //==>increment operator
		System.out.println(c);
	
		System.out.println("*****Decrement Operator*****");
		
		//first way
		int d=10;
		d=d-1;//regular assignment
		System.out.println(d);
		
		//second way
		int d1=10;
		d1-=1;//shorthand assignment
		System.out.println(d1);
		
		//third way
		int d2=10;
		d2--;//decrement operator
		System.out.println(d2);
		
		
   //NOT:with increment & decrement operators we can be used only with variable;
		int e=23;
		e++;
		//1++;  compiler error invalid argument
		System.out.println(e);
	}

}
