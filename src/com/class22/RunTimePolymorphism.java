package com.class22;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		//creating an object on parent class
		Animal animal = new Animal();
		animal.sleep();
		animal.eat();
		
		System.out.println("........................................");
		//creating an object on child class
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.meow();
		
		System.out.println("******************************************");
		/*Non Primitive Type Casting;
		 *widening==> creating an object of the child class and giving referance to the Parent class
		 */
		Animal obj = new Cat();//up casting
		obj.eat();//==> from child class ==> Run Time Polymorphism
		obj.sleep();//==> from child class ==> Run Time Polymorphism
		//Run Time Polymorphism == >if parent and child class method are the same 
		//compile will call child class method
		
		//NOTE!!!!!!!!!!!!!!!!!!!! if there is no overridding compile will call parent class method
		
//		obj.meow(); ==> method wont be avaiable in Animal class(parent class cannot access child class)
		
		
		
		
		

		//narrowing:
		//Cat obj2 = new Animal();//Cannot convert from animal to Cat
	}

}
