package com.class08;

import java.util.Scanner;

public class Task2{
	
	public static void main(String[] args) {
		
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		//dont accept which number divisible to 3
		//for example 3,6,9,12,15,18...dont accept these numbers
		//therefore we must use continue
		
		for (int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;	
			}
			System.out.print(i+" ");
		}
		 
		System.out.println( );
		
		/*
		 *Create a program that will be asking user to apply for a credit card 10
		 *times. As soon you get an “yes” from a user program should stop asking.
		 */
		
		//we can write only ten times no coz i<=10
		//whenever we write yes execute will stop.
		String card;
		Scanner scan=new Scanner(System.in);
		
		
		for (int i=1; i<=10; i++) {
			System.out.println("Are you apply to credit card?");
		    card=scan.next();
		    if(card.equals("yes")) {
		    	break;
		    }
			
		}
	}

}
