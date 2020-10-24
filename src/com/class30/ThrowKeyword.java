package com.class30;

public class ThrowKeyword {

	public static void main(String[] args) {
		System.out.println("Beginning");
		callingExceptionMethod();
		System.out.println("End");
	}

	public static void throwingException() {
		System.out.println("Creating an exception");
		ArithmeticException ae = new ArithmeticException();//first we create an object
		throw (ae);//second we throw it
	}

	public static void callingExceptionMethod() {

		try {
			throwingException();
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception got caught");
		}
	}
}