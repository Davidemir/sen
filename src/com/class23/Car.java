package com.class23;

public class Car {

	String make, model;//make=null, model=null
	
	Car(){
		System.out.println("I am a non argument constructor");
	}
	
	Car(String make, String model){
		this.make=make;
		this.model=model;
		/*
		 *  we did not initialized instance variable therefore execute will be null for make and model
		 *  if we dont want to null value we must use super keyword in child  class
		 *  when we use ==> super ("Tesla", "S5"); execute will be for model and make ==> Tesla S5
		 *  
		 *  but when we create another object everytime compile will execute the same value
		 *  how can we fix issue == > 
		 *  
		 *  
		 *  Tesla (( we call parent class variable ) ==> String make, String model, boolean autopilot){
		 *  super(make, model);
		 *  
		 *  issue will be solved.
		 */
	}
}
class Tesla extends Car{
	boolean autopilot;
	Tesla(){
		//super();compiler will add by default to make a call to super class
		//constructor to initialize and object
		System.out.println("I am a child non argument constructor");
	}
	
//	Tesla (boolean autopilot){==> we initialize child class instance variable
	//it will call only child class constructor
	
//		super ("Tesla", "S5");
		
	Tesla (String make, String model,boolean autopilot){
//we initialize parent and child class instance variable and it call parent class and child class constructor.
		
     	super(make, model);//it call parent class constructor 
     	
     	/*note super always MUST BE FIRST LANE. this keyword must be  Second line.
     	 * coz with super keyword first we initialized parent class contructor
     	 * and then we initialized child class.
     	 */
		this.autopilot=autopilot;
	}
	
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has an autopilot "+autopilot);
	}
	
}