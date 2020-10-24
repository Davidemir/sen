package com.class24;

public class PhoneTest {

	public static void main(String[] args) {
		//u can not directly create an object of an abstarct class
		//	Phone phone=new Phone();// Compile Error(CE) CANNOT instanciate
		
		/*
		 * Note we define %50 methods in Parent class therefore we can not create obj for parent class
		 * if we create it, C.E
		 * but our child class defined %100 andd we can create obj for child classes
		 */

		//we can create it indirectly : u can create obj of child class and reference to the parent class
		Phone obj1 = new Iphone();
		obj1.makeCall();//from parent class coz it is not overridding
		obj1.sendText();//from parent class coz it is not overridding
		obj1.takePictures();//from child class coz it is OVERRDDING
		obj1.playGames();//from child class coz it is OVERRDDING
		
		System.out.println(".........................");
		
		Phone obj2 = new Samsung();
		obj2.makeCall();//from parent class coz it is not overridding
		obj2.sendText();//from parent class coz it is not overridding
		obj2.takePictures();//from child class coz it is OVERRDDING
		obj2.playGames();//from child class coz it is OVERRDDING
		
	}

}
