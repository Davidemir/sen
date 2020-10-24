package com.class18;

public class ConstructorDemo {
	
	//non argument constructor (if it has not parameter)
	ConstructorDemo() {
		System.out.println("I am your constructor");//first execution
	}

	//Parameterized Constructor (if it has parameter)
	ConstructorDemo(String str) {
		System.out.println("I am your constructor with 1 String parameter "+str);
	}
	
	ConstructorDemo(int num) {
		System.out.println("I am your constructor with 1 int parameter "+num);
	}
	
	ConstructorDemo(int num, int num1) {
		System.out.println("I am your constructor with 2 int parameter "+num+" , "+num1);//forth execution
	}
	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println("Code after create an Object");//second execution
		obj.hello("Hello");
		
		
		ConstructorDemo obj1 = new ConstructorDemo(123, 345);
		 
	}

	public void hello() {
		
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}
	
	public void hello(String str) {
		//third execution
		System.out.println("Hello Class1");
		System.out.println("Hello Instructors1");
	}
}
