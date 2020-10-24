package com.class11;

public class ForEachIn2D {

	public static void main(String[] args) {
		
		/*
		 * Create a grocery list: 
		 * fruits{ }, 
		 * veggies{ }, 
		 * dairy { },
		 * 
		 * Retrieve all values 2 different loops
		 */
		
		String[][] food = {
				
				{"apple", "orange", "banana"},
				{"tomotoes", "onion", "potatoes"},
				{"milk", "cheese", "egg"},
				
		};
		
		System.out.println(".......with for loop........");
		
		for (int i=0; i<food.length; i++) {
			
			for (int j=0; j<food[i].length; j++) {
				System.out.print(food[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(".......with for each loop........");
		
		for (String[] eat : food) {
			
			for (String meal : eat) {
				System.out.print(meal+" ");
			}
			System.out.println();
		}

	}

}
