package com.class24;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		Car car=new BMW();
		car.drive();
		car.stop();
		car.start();
		car.speed();
		car.breaking();
		
		Vehicle vehicle=new BMW();
		vehicle.drive();
		vehicle.stop();
		vehicle.start();
		vehicle.speed();
	//	vehicle.breaking();//we cannot access breaking coz it defined Parent class
		//compile give u only Parent type in here it is grangparent
	}

}
