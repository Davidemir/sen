package com.class23;

public class TaskCarrrTest {

	public static void main(String[] args) {


		Carrr car = new Carrr(2000, "blue");
		System.out.println(car.calculateSalePrice());
		
		Sedan sedan = new Sedan(2000, "gray", 30);
		System.out.println(sedan.calculateSalePrice());

		Truck truck = new Truck(2000, "yellow", 2000);
		System.out.println(truck.calculateSalePrice());
	}

}
