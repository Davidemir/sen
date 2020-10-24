package com.class13;

public class Car {

	//===THERE IS NO  MAIN METHOD IN THIS CLASS!!!!!!!!!!!!!!!!!!==========
	//BUT WE WANT WE CAN ADD MAIN METHOD IN THIS CLASS
	
		//define attributes/features/state/variables
		String make, model, color;
		int year, wheels, windows, speed;//before we did not define speed compiler give an error
		//in ObjectOfCar class now we write issue will solve.
		
		//we built in template ==>(Car features ).We built only six features therefore we 
		//we can only access these 6 features.
		
		
		
		//adding behavior / action ==>methods();
		//every action has own body=={ } and we don't use comma(,)
		//we built in methods.
		//behavior must be seperate!!!!!!!!!!!!!!
		
		void drive() { // this is one behavior
			System.out.println("Car "+make+" can drive");
		}
		
		void start() { // this is another behavior
			System.out.println("Car "+make+" can start");
		}
                  //hizlanmak
		void accelerate() {// this is another behavior
			System.out.println("Car "+make+" can accelerate");
		}
 }

//...............Variables and methods defined inside the class are class members ..........................


