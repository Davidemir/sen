package com.class25;

public class VehicleTest {

	public static void main(String[] args) {
		
		BMW obj1 = new BMW("31fdbwA4", "Sedan", "BMW", "X6");
		//everytime there is an object of vehicle will be calculated 
		BMW.displayTotal();
		//or
		Vehicle.displayTotal();
		//or
		Car.displayTotal();
		
		//NOTE 1: child class can access parent and grandparent features
		
		//come from Vehicle class(grandparent class)
		obj1.drive();
		obj1.speed();
		obj1.start();
		obj1.stop();
		
		//come from Carclass(parent class)
		obj1.breaking();
		//come from BMW class(child class)
		obj1.display();
		
		
		Car obj2 = new BMW("15cwvy41", "SUV", "BMW", "X5");
		//everytime there is an object of vehicle will be calculated 
		BMW.displayTotal();
		//or
		Vehicle.displayTotal();
		//or
		Car.displayTotal();
		
		//NOTE 2: parent class can access grandparent features but
		//it cannot acces child class features
		
		// come from Vehicle class(grandparent class)
		obj2.drive();
		obj2.speed();
		obj2.start();
		obj2.stop();

		// come from Carclass(parent class)
		obj2.breaking();
		// come from BMW class(child class) ==> wont be avaiable to parent class
//		obj2.display(); 
		
		Vehicle obj3 = new BMW("78vvrd86", "Track", "BMW", "A7");
		//everytime there is an object of vehicle will be calculated 
		BMW.displayTotal();
		//or
		Vehicle.displayTotal();
		//or
		Car.displayTotal();
		
		//NOTE 3: grandparent class can access only own features 
		//it cannot access parent and child class features
		
		// come from Vehicle class(grandparent class)
		obj3.drive();
		obj3.speed();
		obj3.start();
		obj3.stop();

		// come from Carclass(parent class) ==> wont be available to the parent
//		obj3.breaking();
		// come from BMW class(child class) ==> wont be avaiable to grandparent class
//		obj3.display(); 
		
		
		
		//everytime there is an object of vehicle will be calculated 
		
		new BMW("414cvgbg", "SUV", "BMW", "X5");
		new BMW("24cgxcbz", "Sedan", "BMW", "X4");
		new BMW("65facyuu", "Track", "BMW", "i7");

		System.out.println("......................");
		Vehicle.displayTotal();//6 coz java works top to bottom and it has 6 vehicles.
	}

}
