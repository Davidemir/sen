package com.class23;
/*
 * Create a Class Car that would have the following fields: 
 * carPrice, color instance variables 
 * and method calculateSalePrice()  which should be returning a price of the car.
 * Create 2 sub classes: Sedan and Truck. 
 * 
 * The Truck class has field as weight
 * and has its own implementation of calculateSalePrice() method in which
 * returned price calculated as following: if weight>2000 then returned price
 * car should include 10% discount, otherwise 20% discount. 
 * 
 * The Sedan class has
 * field as length and also does it is own implementation of
 * calculateSalePrice(): if length of sedan is >20 feet then returned car price
 * should include 5% discount, otherwise 10% discount
 * 
 */

class Carrr{
	
	double carPrice;
	String color;
	
	Carrr(double carPrice, String color){
		this.carPrice = carPrice;
		this.color = color;
	}
	
	public double calculateSalePrice() {
		return carPrice;
	}
	
	public void display() {
		System.out.println("Sale price of "+ color + " vehicle is $ "+carPrice);
	}
}

class Sedan extends Carrr{
   
	int lenght;
	Sedan(double carPrice, String color, int lenght) {
		super(carPrice, color);
		this.lenght = lenght;	
	}
	
	public double calculateSalePrice() {
		double sedanPrice;
		if(lenght>20) {
			sedanPrice = carPrice-(carPrice*0.05);
		}else {
			sedanPrice = carPrice-(carPrice*0.10);
		}
		return sedanPrice;
	}
	
}

class Truck extends Carrr{

    int weight;
	
	Truck(double carPrice, String color,int weight) {
		super(carPrice, color);
		this.weight = weight;
	}
	
	public double calculateSalePrice() {
		double truckPrice;
		if(weight>2000) {
			truckPrice = carPrice-(carPrice*0.10);
		}else {
			truckPrice = carPrice-(carPrice*0.20);
		}
		return truckPrice;
	
    }

}