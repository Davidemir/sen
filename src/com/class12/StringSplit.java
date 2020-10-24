package com.class12;

public class StringSplit {

	public static void main(String[] args) {
		
		/* 18.===variableName.splits(String regex)========
		 * 
		 * This method splits (bolmek) string around matches of the given regular expression.
		 * split returns String array[]
		 * 
		 */
		
		String str = "Welcome Syntax Students Batch 5";
		String[] array = str.split("S"); //split returns String array[]
        System.out.println("The length of the array is "+array.length);
        
       for (String split : array) {
    	   System.out.println(split);
       }
       
       System.out.println("---------------------");
       
       for (int i=0; i<array.length; i++) {
    	   System.out.println(array[i]);
       }
	}

}
