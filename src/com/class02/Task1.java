package com.class02;

public class Task1 {
	
	public static void main(String[] args) {
		/*
		 * A.) In your program create different type of variables to store student’s information 
		 * and then print value of those variables: 
		 * name, lastName, grade, city, state,phoneNumber 
		 * 
		 * B.) Change student’s city, state, phone number and grade. And print those updated values.
		 */
		String name="David";
		String lastName="Iron";
		char grade='A';
		String city="Toronto";
		String state="ON";
		int phoneNumber=1234565645;
		
		//String name="Cris";-->compile give an error coz declare MUST BE ONE TIME.
		//we declare the name thefore we dont need declare again.
		name="Cris";
		lastName="Alex";
		grade='B';
		city="New York City";
		state="New York";
		phoneNumber=987654321;
		
		System.out.println("My name is "+name);
		System.out.println("My lastname is "+lastName);
		System.out.println("My grade is "+grade);
		System.out.println("My city is "+city);
		System.out.println("My state is "+state);
		System.out.println("My phone number is "+phoneNumber);
	
	}

}
