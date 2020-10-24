package com.class18;

public class BetterCar {
	

	/*
	 * we want to build make as Toyota 
	 * that will have different models and color
	 */
	
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	 
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors) {
		//Constructor can intialize instance variables and when u make execute it will make short way
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
		
	}
	
	public static void main(String[] args) {
		//if I wanna change car (toyota to bmw) and for this class all car info will change.
		make = "BMW";//we can write BetterCar.make = "BMW"; but we dont need coz we are in the same class
		
		
		/* compiler will give an error, we have to pass values when we build an Object
		 * those values will be passed as arguments to the constructor through
		 * constructor instance variables will get initialized 
		 */
		// BetterCar bCar = new BetterCar();
		
		BetterCar bCar = new BetterCar("X5", "Blue", 400, 2);
		bCar.getDetails();
		
				
				
	}
	
	public void getDetails() {
		System.out.println("I build "+color+" "+make+" "+model);
		System.out.println("My car has "+doors+" doors and can have speed up to "+speed);
	}

}
