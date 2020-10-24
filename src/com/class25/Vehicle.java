package com.class25;

public abstract class Vehicle{//abstract class   grandparent class %50 define
	
	String vinNumber;//We can create instance variable inside abstract class 
	static int totalVehicles;//We can create static variable inside abstract class
	
	
	/*
	 * ==>when we create contructor compiler will be error in Car class
	 * therefore we must use super(); in Car class it will be fix it.
	 *  Car(String vinNumber){
	    super(vinNumber); 
	 */
	Vehicle(String vinNumber){//we can create constructor inside abstract class
		this.vinNumber = vinNumber;  
		totalVehicles++;            
	//I increment vehicle ==>it means everytime there is an object of vehicle will be calculated                          
		                                     
	}
	public void drive() {//we can create instance methods
		System.out.println("Vehicle can drive");
	}
	
	public void stop() {//we can create instance methods
		System.out.println("Vehicle can stop");
	}
	
	public static void displayTotal() {//we can create static methods
		System.out.println("Total vehicles we build= "+totalVehicles);
	}
	public abstract void start();
	public abstract void speed();

}

abstract class Car extends Vehicle{//abstract class  parent class  %75 define
	String carType; // we can create instance variable inside CAR
	
	
	//==>when we create contructor in Parent class (in here is grandparent class)
	//compiler will be error in Car class(normally car is parent class but still is child of grandparent)
    //therefore we must create Car class contructor Car(String vinNumber)and use super(vinNumber); 
	//in Car class it will be fix it.coz super call parent class constructor.
     
	Car(String vinNumber, String carType){
		super(vinNumber);//(Constructor super always must be 1 line 
                        //but super.methodName it can be any line.
		this.carType = carType;//it must be second line
		
		//Note this constructor this() it must be 1 line like super constructor super()
		//therefore this and super constructor can NOT use together
		
		/*
		 * when we create Constructor inside Car class
		 * compiler give an error inside BMW CLASS
		 * therefore we must create BMW constructor and use super();
		 * like that ===> BMW(String vinNumber, String carType){
		                  super(vinNumber, carType);
	                      }
		 * 
		 */
	}
	public void speed() {
		System.out.println("Max car speed up to 400");
	}
	
	//we can create inside unimplement method parent class 
	public abstract void breaking();
}

class BMW extends Car{//concrete class:child class will provide all implementions  from abstract class
	//note when we extends we can extends parent class(car) if u extends grandparent class ==>Compile Error

	
	String make, model; // we can create instance variable inside BMW
	/*
	 * when we create Constructor inside Car class
	 * compiler give an error inside BMW CLASS
	 * therefore we must create BMW constrcutor and use super();
	 * like that ===> BMW(String vinNumber, String carType){
	                  super(vinNumber, carType);
                      }
	 * 
	 */
	BMW(String vinNumber, String carType, String make, String model){
		super(vinNumber, carType);//(Constructor super always must be 1 line 
		                         //but super.methodName it can be any line.
		this.make = make;//it must be second line
		this.model = model;//it must be second line
	}
	@Override
	public void start() {
		System.out.println("BMW starts remote");
		
	}

    @Override
    public void breaking() {
	System.out.println("BMW can break");
    }
	
	

    public void display() {
    	System.out.println("We build "+make+" "+model+" with vin# "+vinNumber);
    }
	
	
}
	
	
	

