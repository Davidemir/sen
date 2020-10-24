package com.class22;

public class Animal2Test {

	public static void main(String[] args) {
		
		//if parent and child class has static method we can not overridding we achieve method hiding.
		//therefore it will execute from parent class.
		Animal2 animal = new Monkey();
		animal.whoAmI();

	}

}
