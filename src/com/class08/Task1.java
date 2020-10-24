package com.class08;

public class Task1 {
	
	public static void main(String[] args) {
		
		System.out.println("Print numbers from 1 to 100 in 1 lone with space==> incremment use i++");

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println("Print numbers from 100 to 1 ==>decrement use i--");

		for (int i = 100; i >= 1; i--) {
			System.out.println(i + " ");
		}
		
		
		// =================ODD NUMBERS===============

		System.out.println("Print ODD NUMBERS from 20 to 50==>increment use i+=2(2 ways)");
		System.out.println("ODD NUMBERS ==>first way");
		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i);
		}

		System.out.println("ODD NUMBERS ==>second way");
		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1)
				System.out.println(i);
		}

		// =================EVEN NUMBERS===============

		System.out.println("Print EVEN NUMBERS from 20 to 1 ==>decrement use i-=2(2 ways)");
		System.out.println("EVEN NUMBERS ==>first way");
		for (int i = 20; i >= 2; i -= 2) {
			System.out.println(i);
		}

		System.out.println("EVEN NUMBERS ==>second way");
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 1)
				System.out.println(i);
		}
	}

}
