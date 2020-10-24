package com.class22;

public class MethodOverriddingInfo {
	
	/*
	 * Run time polymorphism/ dynamic binding / late binding can be achieved through
	 * method overriding
	 * 
	 * Method of superclass is overridden in subclass to provide more specific
	 * implementation.
	 * 
	 * Note: Without Inheritance method overriding is not possible.
	 * 
	 * Method overriding -same method and parameters exist with Super class and
	 * Subclass
	 * 
	 * In method overriding Method Signature(name+parameters) and Return Type MUST
	 * BE SAME.
	 * 
	 * TypeCasting in Java --> changing one type to another type
	 * 
	 * Widening Casting(Implicit/ Automatic)/UpCasting - converting lower data type
	 * into higher
	 * 
	 * Narrowing Casting(Explicit/ Manual)/DownCasting - converting higher data type
	 * into lower.
	 * 
	 * widening==> creating an object of the child class and giving referance to the Parent class.
	 * Animal obj = new Cat();//up casting
	 * 
	 * Cat obj2 = new Animal();//down casting  Cannot convert from animal to Cat
	 * 
	 * -primitives --> byte->short->int->long->float->double 
	 * -non-primitives
	 * 
	 * 
	 * Advantages of dynamic binding along with polymorphism with method overriding:
	 * 1. Less memory space 2. Less execution time 3. More performance
	 * 
	 * 
	 * === ============== ===============Rules for Java Method Overriding ====================== 
	 * 1. If a method cannot be inherited then it cannot be
	 * overridden. Therefore, private methods cannot be overridden.
	 * 
	 * 2. The method signature (method name & parameters) and return type MUST BE
	 * same 
	 * 
	 * 3. Constructors CANNOT be Overriden 
	 * 
	 * 4. When Overriding we CANNOT reduce a visibility of a method(access modifier),
	 * but can be INCREASED
	 * 
	 * public > protected > default > private
	 * 
	 * 5. Main method cannot be overridden.
	 * 
	 * 6. A method declared final cannot be overridden.
	 * 
	 * 7. A subclass within the same package as the instance's superclass can
	 * override any superclass method that is not declared private or final.
	 * 
	 * 8. A subclass in a different package can only override the non-final
	 * methods declared public or protected.
	 * 
	 * 9. Static methods CANNOT be Overriden, they
	 * are hidden


	 */

}
