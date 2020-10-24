package com.class14;

public class Task1 {
	
	public static void main(String[] args) {
		
		/*NOTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * 
		 * Parameter vs argument
		 * When we create method we specify parameters
		 * when we call method we pass value=argument
		 */
		
		Task1 obj = new Task1();
		obj.largeNumber(12, 8);//12, 8==>argument
		obj.evenOrOddNumber(7);//7===>argument
		obj.isPolindrome("hello"); //hello==>argument
		obj.isPolindrome("kayak");//kayak===>argument
		obj.isPolindrome("anna");//anna==>argument
	}
	
	
	/*
	 * Create a method that will take 2 parameters as a numbers and 
	 * prints which number is larger
	 */
	
	    //largeNumber==>method name
	void largeNumber(int firstNumber, int secondNumber) {//int firstNumber, int secondNumber==>2 int type parameters
		
		//int firstNumber =12;
		//int secondNumber =8; ==>instead of these we 
		//write void largeNumber(int firstNumber, int secondNumber) 
		if (firstNumber>secondNumber) {
			System.out.println(" The larger number is "+firstNumber);
		}else  if (secondNumber>firstNumber){
			System.out.println(" The larger number is "+secondNumber);
		}else {
			System.out.println("Numbers are equal");
		}
	}
	
	/*Create a method that will take a number and prints 
	 * whether the number is even or odd.
	 */
	 
	    //evenOrOddNumber==>method name
	void evenOrOddNumber(int number) {//int number==>parameter
	//	int number = 3;//instead of this we wrote void evenOrOddNumber(int number)
		if(number%2==0) {
			System.out.println("The number is even number");
		}else {
			System.out.println("The number is odd number");
		}
	}
	
	
	/*
	 * Create a method that will print whether given String is polindrome or not.
	 */
	
	      //isPolindrome==>method name
	void isPolindrome(String word) {//String word==>parameter
		
		String reverse = "";
		for (int i = word.length()-1; i>=0; i--) {
			reverse = reverse + word.charAt(i);
		}  
		   
		    if(word.equals(reverse)) {
		    	System.out.println("The string is a polindrome.");
		    }else {
		    	System.out.println("The string is NOT  a polindrome.");
		    }
		
		     
	}

}
