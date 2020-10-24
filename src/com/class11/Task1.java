package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */
		System.out.println(" with for loop");
		String[] cars = {"BMW", "TOYOTA", "KIA", "ACURA", "MERCEDES", "VOLVO"};
		
		for ( int i=0; i<cars.length; i++) {
			System.out.println(cars[i]+" ");
		}
		
		System.out.println("with another for loop");
		for ( int i=0; i<=cars.length-1; i++) {
			System.out.println(cars[i]+" ");
		}
		
		System.out.println("with for each loop/ advanced loop/ enhanced loop");
		for (String name : cars) {
			System.out.println(name+" ");
		}
		
		
		/*
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		
		int[] nums = { 1,2,3,4,5};
		int sum=0;
		
		for (int i=0; i<nums.length; i++) {
		 sum=sum+nums[i];
		 //System.out.println(sum); //if u write inside the for loop it will sum by one by 
		 //therefore write outside the the for loop.
		}
		 System.out.println(sum);
		 
		
		
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */
		 
		 String[] countries1 = { "Japon", "Usa", "Canada", "Spain"};
		 String capital1;
		 
		 for (String country : countries1) {
		 
			 if (country.equals("Japon")) {
				 System.out.println("Tokyo");
			 }else if (country.equals("Usa")) {
				 System.out.println("Washington DC");
			 }else if (country.equals("Canada")) {
				 System.out.println("Ottawa");
			 }else if (country.equals("Spain")) {
				 System.out.println("Madrid");
			 }
		 }
		 
		 System.out.println("...................................");
		 
		 String[] countries2 = { "Japon", "Usa", "Canada", "Spain"};
		 String capital2;
		for (String country : countries2) {
			
			switch (country) {

			case "Japon":
				capital2 = "Tokyo";
				break;
			case "Usa":
				capital2 = "Washington DC";
				break;
			case "Canada":
				capital2 = "Ottawa";
				break;
			case "Spain":
				capital2 = "Madrid";
				break;
			default:
				capital2 = "Unknown";

			}

			System.out.println(capital2);
			
		 }
		 
		System.out.println("...................................");
		
		 String[] countries = { "Japon", "Usa", "Canada", "Spain"};
		 String capital;
		 
		 for (int i=0; i<=countries.length-1; i++) {
			 
			 switch (countries [i]) {
			 
			 case "Japon":
				 capital="Tokyo";
				 break;
			 case "Usa":
				 capital="Washington DC";
				 break;
			 case "Canada":
				 capital="Ottawa";
				 break;
			 case "Spain":
				 capital="Madrid";
				 break;
			 default :
				 capital="Unknown";
	 
			 }
			 
			 System.out.println(capital);
			 
			 
			 
			 }
			 
			
		 }
		 
	}


