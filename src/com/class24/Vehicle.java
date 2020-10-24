package com.class24;


public abstract class Vehicle {//abstract class   grandparent class %50 define
	
	public void drive() {
		System.out.println("Vehicle can drive");
	}
	
	public void stop() {
		System.out.println("Vehicle can stop");
	}
	
	public abstract void start();
	public abstract void speed();

}

abstract class Car extends Vehicle{//abstract class  parent class  %75 define
	
	public void speed() {
		System.out.println("Max car speed up to 400");
	}
	
	//we can create unimplement method inside parent class 
	public abstract void breaking();
}

class BMW extends Car{//concrete class:child class will provide all implementions from abstract class
	//note: we extends we can extends parent class(car). if u extends grandparent class ==>Compile Error
	@Override
	public void start() {
		System.out.println("BMW starts remote");
		
	}

    @Override
    public void breaking() {
	System.out.println("BMW can break");
    }
	
	

	
	
}
	
	
	

