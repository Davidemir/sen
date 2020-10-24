package com.class07;

public class WhileLoopOddNumber {

	public static void main(String[] args) {
		

		System.out.println("...How to print all ODD  NUMBERS from 100 to 1 inclusive ..(decrement example)...");
		
		int f = 100;// or f=99 both of right

		while (f >= 1) {

			if (f % 2 == 1) {
				System.out.println(f);

			}
			f--;// or f-=1;
		}
		
		System.out.println("...How to print all ODD  NUMBERS from 50 to 100 inclusive ..(increment example)...");
		
		int j=51;
		
		while(j<100) {
			System.out.println(j);
			j+=2;
		}
		
		

		
	}

}
