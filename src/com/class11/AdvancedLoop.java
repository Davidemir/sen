package com.class11;

public class AdvancedLoop {

	public static void main(String[] args) {
		
		
		/*========Retrieve values using ==> ADVANCED FOR LOOP// FOR EACH LOOP//ENHANCED FOR LOOP(the same meaning)==========
		
		 * For-Each Loop is another form of for loop used to traverse the array. 
		 * ● It starts with the keyword for like a normal for-loop. 
		 * ● Instead of declaring and initializing a loop counter variable, 
		 * we declare a variable that is the same type as the base type of the array, 
		 * followed by a colon, which is then followed by the array name. 
		 * ● In the loop body, we can use the loop variable
		 * we created rather than using an indexed array element. 
		 * ● It’s commonly used to iterate over an array or a Collections class
		 * 
		 * Syntax of for-each loop: 
		 * for(data_type variable : array | collection){
		 * 
		 * System.out.println(data_type variable);
		 * }
		 * 
		 */
		
		String[] name= { "Asel","David","Halo","Efe","Weqas"};
		
		for (String developer: name) {
			System.out.println(developer);
			
		}
		
		int[] numbers= { 12,13,14,15,16,17};
		
		for (int monkey : numbers) {
			System.out.print(monkey+" ");
		}
		
	}

}
