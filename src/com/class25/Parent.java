package com.class25;

public class Parent {
	
	static void hello() {
		System.out.println("Hello from Super class");//it is not overridden coz it is static method
		                                          //we call ==> method hidding!!!!!!!!!!!!!!!!!!!!!
	}

}

class Child extends Parent{
	
	static void hello() {
		System.out.println("Hello from Sub class");//it is not overridding coz it is static method
		//we call ==> method hidding!!!!!!!!!!!!!!!!!!!!!
	}
}

