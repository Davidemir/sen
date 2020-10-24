package com.class14;

public class MethodsWITHOUTParameters {
	
	void sayHello() {//sayHello() if parantesis is empty ==> without parameter
		
		System.out.println("Hello Dave");
		//if we want to change name we must write sout again or
		//Change name inside the sout
		System.out.println("Hello Haloo");
		System.out.println("Hello Efe");
		System.out.println("Hello Adam");
	}
	
	
	public static void main(String[] args) {
		
		MethodsWITHOUTParameters obj = new MethodsWITHOUTParameters();
		obj.sayHello();
		
	}

}
