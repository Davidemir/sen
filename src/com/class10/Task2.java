package com.class10;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of cars and store 6 elements into it. Print all values from the array.
		 */
		
		String[] cars= {"BMW", "Toyota", "Honda", "Acura", "Mercedes", "Haci Murat"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
		/*
		 * Create an array on integers and calculate the sum of all elements in an array.
		 */
		
		int[] num= {1, 2, 3, 4, 5, 6};
		int sum=0;
		
		for (int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		
		System.out.println(".................................");
		/*
	     * Create an array of countries. 
	     * While retrieving all values from an array print capital for each country. 
	     * 
	     */
		
		//First way: 
		
		String[] countries = {"Turkey", "Canada", "USA", "Italy", "Germany"};
		String capital;
		for (int i=0; i<countries.length; i++) {
			
			switch (countries[i]) {
			
			case "Turkey":
				capital= "Ankara";
				break;
			case "Canada":
				capital= "Ottowa";
				break;
			case "USA":
				capital= "Washington DC";
				break;
			case "Italy":
				capital= "Roma";
				break;
			case "Germany":
				capital= "Berlin";
				break;
			default:
				capital="Unknown";
			}
			System.out.println(capital);
		}
		
		System.out.println("..................................");
		
		//Second way
		
		String[] countries1= {"Turkey", "Canada", "USA", "Italy", "Germany"};

		for(int i=0; i< countries1.length; i++) {
			
			if(countries1[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries1[i].equals("Canada")) {
				System.out.println("Ottowa");
			}else if(countries1[i].equals("USA")) {
				System.out.println("Washington DC");
			}else if(countries1[i].equals("Italy")) {
				System.out.println("Roma");
			}else if(countries1[i].equals("Germany")) {
				System.out.println("Berlin");
			}
		}
		}
	
	    
}
	    
	    	
	    	