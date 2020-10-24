package com.class16;

import InterviewQuestions.ReverseString;

public class Task {
	
	/*
	 * 1. Create a method that will take 1 parameter as a String and return reversed String. 
	 * Method should be visibly only within same package(it can be public , default or protected)
	 */

	String reserveString(String name) {
		String result = "";
		
		char [] c = name.toCharArray();
		
		for (int i=c.length-1; i>=0; i--) {
			result = result + c[i];// or result += c[i];
		}
		
		return result;
	}
	
	
	/*
	 * 2. Create a method that will take a String and return whether 
	 * String is palindrome or not. Method should be available to all classes within your projects.(public)
	 */
	
	public boolean isPolindrome(String str) {
		boolean result = false;
		
		String reverse = reserveString(str);//we can use 1. question method
		
		if (str.equalsIgnoreCase(reverse)) {
			result = true;
		}else {
			result = false;
		}
		
		return true;
	}
	
	
	/*
	 * 3. Create a method that will take a string and return an array of words from
	 * that string. Method should be available only within same class.(private)
	 */
	
	private String [] arrayOfWords(String word) {
		
//		first way: it is long way
//		String [] stringArray = word.split(" ");
//		
//		return stringArray;
		
		
		//second way : it is short way
		return word.split(" ");
	}
	
	public static void main(String[] args) {
		
		Task t = new Task();
		System.out.println(t.reserveString("Dave"));
		
		String str = "madam";
		boolean b = t.isPolindrome(str);
		System.out.println("Is "+str+ " Polindrome? "+b);
		
		String [] array = t.arrayOfWords("What a beautiful day");
		for (String s : array) {
			System.out.println(s);
		}
	}
}
