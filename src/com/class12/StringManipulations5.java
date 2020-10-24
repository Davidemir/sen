package com.class12;

public class StringManipulations5 {

	public static void main(String[] args) {
		
		System.out.println("=== 17. variableName.toCharArray(); ===)");
		
		/*17. variableName.toCharArray();
		 * 
		 * it converts string to array of characters
		 * it returns to char
		 */
		
		String str = "saturday";
		
		char[] array = str.toCharArray();
		
		System.out.println("...........  with for loop ............");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("...........  with advanced loop ............");
		for (char c : array ) {
			System.out.println(c);
			
		}
		
		
		
	}

}
