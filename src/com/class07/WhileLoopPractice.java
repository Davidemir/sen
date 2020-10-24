package com.class07;

public class WhileLoopPractice {
	
	public static void main(String[] args) {
		
		System.out.println("...How to print from 1 to 20..(increment example)...");
		
		int i=0;
		
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("...How to print from 10 to 30 all in one line..(increment example)...");
		
		int a=10;
		
		while(a<=30) {
			System.out.print(a+" ");
			a++;
		}
		
		
		System.out.println("...How to print from 10 to 1 ..(decrement example)...");
		
		int y=10;
	//not if we write y<=1; condition is false and execute will ignore it.
		while(y>=1) {
			System.out.println(y+" ");
			y--;
		}
		
		System.out.println("...How to print from 50 to 20 ..(decrement example)...");
		
		int b=50;
		
		while(b>=20) {
			System.out.println(b+" ");
			b--;
		}
		
		
		
		
	}

}
