package com.class11;

public class Task3 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array
		 */
		
		String[][] cars = {
				
				{ "Chevroulet", "BMW", "Kia", "Ferrari"},
				{ "American", "German", "Korean", "Italian" },	
		};
		
		//first way with advanced loop
		for (String[] country : cars) {
			
			for (String model:country) {	
				System.out.print(model+" ");
			}
			System.out.println();
			
	
		}
		
		System.out.println("......................");
		
		//first way with for loop
		for (int i=0; i<cars.length; i++) {
			
			for ( int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("..............................");
		
		/*
		 * Create an array of countries: 
		 * north america countries, south america countries, 
		 * europe countries, asian countries, african countries. 
		 * Then print all values from that array.
		 */
		
		String[][] countries = {
				
				{ "USA", "Canada", "Mexico"},
				{ "Brazil", "Argentina", "Peru"},
				{ "South Korea", "Japon", "Kazakhistan"},
				{ "Nigeria", "Tanzania", "Kenya"},	
		};
		
		//first way with for loop
		for (int i=0; i<=countries.length-1; i++) {
			
			for (int j=0; j<countries[i].length; j++) {
				
				System.out.print(countries[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("...............................");
		
		//second way with enhanced loop
		
		for (String [] countrY : countries) {
			for (String place : countrY) {
				System.out.print(place+" ");
			}
			System.out.println();
		}

	}

}
