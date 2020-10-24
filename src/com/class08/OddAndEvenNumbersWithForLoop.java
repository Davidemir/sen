package com.class08;

public class OddAndEvenNumbersWithForLoop {

	public static void main(String[] args) {
		
		// =================ODD NUMBERS===============
		
		System.out.println("Print ODD NUMBERS from 20 to 50==>increment use i+=2(2 ways)");
		System.out.println("ODD NUMBERS ==>first way");
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		
		
		System.out.println("ODD NUMBERS ==>second way");
		for (int i=20; i<=50; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}
		
		
		
		// =================EVEN NUMBERS===============
		
		System.out.println("Print EVEN NUMBERS from 20 to 1 ==>decrement use i-=2(2 ways)");
		System.out.println("EVEN NUMBERS ==>first way");
		for (int i=20; i>=2; i-=2) {
			System.out.println(i);
		}
		
		System.out.println("EVEN NUMBERS ==>second way");
		for (int i=20; i>=1; i--) {
			if (i % 2 == 1)
				System.out.println(i);
		}
	}

}
