package com.class13;

import java.util.Scanner;

public class ObjectOfCarClass {
	
	public static void main(String[] args) {
		
		//to create on object syntax is;
		//ClassName variable = new ClassName();
		
		//Scanner scan = new Scanner(System.in);Scanner is a class
		//String str = new String(); String is a class
		
		
		//===THERE is MAIN METHOD IN THIS CLASS!!!!!!!!!!!!!!!!!!==========
		
		Car car1 = new Car();//we built in individual Car Objects.
		car1.make = "Tesla";
		car1.model = "S";
		car1.color = "Black";
		car1.year = 2020;
		car1.wheels = 4;
		car1.windows = 5;
		//car1.speed = 200;//we did not defined speed features
		//therefore compiler give an error.If we wanna add speed
		//we must define speed  in CAR CLASS
		car1.speed = 200;
		
		//accessing behavior first object
		car1.drive();//calling method start from class Car
		car1.accelerate();
		car1.start();
		
		System.out.println(".................");
		
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.color ="Purple";
		car2.year = 2019;
		car2.wheels = 4;
		car2.windows = 6;
		car2.speed = 300;
		car2.make = "Toyota";//we want to change car name therefore we wrote toyota now our car2 name is toyota.
		
		//accessing behavior second object
		car2.drive();
		car2.accelerate();
		car2.start();
		//car2.reverse();////we did not defined reverse behavior (method) in car class
		//therefore compiler give an error.If we wanna add reverse behavior
		//we must built in CAR CLASS
		
		// print features of the car
		// I have black Tesla
		System.out.println("I have "+car1.color+" "+car1.make);
		
		// I drive BMW 2019
		System.out.println("I drive "+car2.make+" "+car2.year);
		
	}

}
