package com.class22;

public class Animal2 {
	
	public static void whoAmI() {
		System.out.println("I am an animal");
	}

}


class Monkey extends Animal2 {
	
//	// not override static methods with instance methods
//	public void sleep() {
//		System.out.println("Cat sleep all day");//we can change implemantation.
//	}
	
	
	//@Override ==> we can not override any static methods
	//when both methods are static with in sub and super class it is method hiding.
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}