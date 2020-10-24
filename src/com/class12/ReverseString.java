package com.class12;

public class ReverseString {

	public static void main(String[] args) {
		
		/*Reverse a String without using a reverse function=
		 * 
		 * 1.toCharArray();
		 * 2.charAt();
		 * 3.substring();
		 */
		
         ///////////////////////////////////////
        ///////////////////////////////////////
		System.out.println(" 1. toCharArray(); ");
        ///////////////////////////////////////	
        ///////////////////////////////////////
		
		String original = "Today is Java Class";
		String reverse1 = "";
		
		char[] array = original.toCharArray();
		
		//we add the -1 coz we are not looking lenght we are looking index
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		//or
		for (int i=array.length-1; i>=0; i--) {
			reverse1 = reverse1+array[i];
		}
		
		System.out.println("Reverse String is: "+reverse1);
		
		
		
         ///////////////////////////////////////
		////////////////////////////////////////
		System.out.println(" 2. charAt(); ");
		///////////////////////////////////////
        ///////////////////////////////////////
		
		String reverse2 = "";
		
		for (int i=original.length()-1; i>=0; i--) {
			reverse2 = reverse2 + original.charAt(i);
		}
		
		System.out.println("Reverse String is: "+reverse2);
		
		
		 
        ///////////////////////////////////////
		///////////////////////////////////////
		System.out.println(" 3. substring(); ");
        ///////////////////////////////////////
        ///////////////////////////////////////
		
		String reverse3 = "";
		
		for (int i=original.length(); i>0; i--) {
			reverse3=reverse3 + original.substring(i-1, i);
		}
		System.out.println("Reverse String is: "+reverse3);
	}

}
