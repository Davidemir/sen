package com.class07;

public class WhileLoopEvenNumber {
	
	public static void main(String[] args) {
		
System.out.println("...How to print all EVEN NUMBERS from 1 to 20 inclusive ..(increment example)...");
		
		//first way==>increment value by 2
		int c=2;
		
		while(c<=20) {
			System.out.println(c);
			c+=2;
		}
		
		
		System.out.println("*******************************");
		
		
		//second way==> using modulus(reminder)
		int d=2;//or d=1 both of right.
		
		while(d<=20) {
			//System.out.println("........");//although if condition is false while still working.this is exam of working.
			//it will execute infinitive
			if(d%2==0) {
				System.out.println(d);
				//d++;// if we write increment inside the if block execute will not work.
			//	coz if conditon is False in here.therefore we wrote increment outside if block.
			
			}
			d++;
		}
		//d++;// if we wrote here execute will infinitive.
		
		System.out.println("...How to print all EVEN NUMBERS from 100 to 1 inclusive ..(decrement example)...");
		
		int k=100;//or f=99 both of right
		
		while(k>=1) {
			
			if(k%2==0) {
				System.out.println(k);
				
			}
			k--;// or f-=1;
		}
	}

}
