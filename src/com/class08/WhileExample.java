package com.class08;

import java.util.Scanner;

public class WhileExample {
	// important=If we don't know number of iterations WHILE loop /Do While loop is BEST choice for the loop
	public static void main(String[] args) {
		
		/* Let's ask user enter if it is raining or not(true or false)
		 * as long as there is rain let's keep asking rain
		 * as long as there is no rain--> you can go to the park
		 */
		
		System.out.println(".......First way with while loop.......");
		//our variable based on user therefore we did not write increment.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is it raining?");
		boolean rain=scan.nextBoolean();
		
		while(rain) { //meaning rain==true
			System.out.println("Is it raining?");
			rain=scan.nextBoolean();
		}
		
		System.out.println("You can go to the park");
		
		
		System.out.println(".......First way with do while loop.......");
		
		
		boolean isRain;
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.nextBoolean();//we wrote scanner above therefore we did not write again.
			
		}while(isRain);//meaning isRain==true
		
		System.out.println("You can go to the park");
		
	}
}
