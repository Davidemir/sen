package com.class23;

public class Child extends Parent {

	String name = "James";

	public static void main(String[] args) {
		Child obj = new Child();
		obj.callName();
		obj.callingMethod();
	}

	public void callName() {
		System.out.println(name+" "+lastName);//==> it will call child class
		System.out.println(super.name+" "+super.lastName);//==> it will call parent class
		
		
	}

	public void callingMethod() {
//		this.callName();  and callName is the same coz BY DEFAULT THIS IS ADDED
		callName();//BY DEFAULT THIS IS ADDED- SO WE ARE CALLING CURRENT CLASS METHOD
		super.callName();// =>it will call parent class method
	}
}
