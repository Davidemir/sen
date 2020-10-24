package com.class18;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car.make = "Toyota";
		System.out.println(".......long way..........");
		Car car1 = new Car();
		car1.model = "Camry";
		car1.color = "grey";
		car1.speed = 200;
		car1.doors = 4;
		car1.getDetails();
		
		
		Car car2 = new Car();
		car2.model = "Corolla";
		car2.color = "white";
		car2.speed = 180;
		car2.doors = 2;
		car2.getDetails();
		
		Car car3 = new Car();
		car3.model = "Prius";
		car3.color = "green";
		car3.getDetails();
		//we did not create speed and doors for car3 
		//therefore it will be default int value ==>0
		
		
		
		System.out.println(".......short way..........");
		
		BetterCar.make = "Toyota";
		BetterCar betterCar = new BetterCar("Camry", "grey", 200, 4);
		betterCar.getDetails();
		
		
		BetterCar betterCar1 = new BetterCar("Corolla", "white", 180, 2);
		betterCar1.getDetails();
	}

}
