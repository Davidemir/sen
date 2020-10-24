package com.class21;

public class MethodOverloadingInfo {
	
	/*
	 * Compile time polymorphism can be achieved by using Method overloading -
	 * Methods - Constructors
	 * 
	 * 
	 * ==> Method overloading is having same method name within SAME class by having
	 * different number of parameters of different type of parameters.
	 * 
	 * ==> * There are two ways to overload the method in java: 1. By changing
	 * number of parameters (different amount of paramters) 2. By changing the data
	 * type (different type of parameters)
	 * 
	 * ==> Overloading is not possible by changing return type of the method or
	 * access modifier since compiler looks only at the method signature.
	 * 
	 * Syntax: class class_Name {
	 * 
	 * Returntype method() { .........}
	 * 
	 * Returntype method(datatype1 variable1) { .........}
	 * 
	 * }
	 * 
	 * ==> Method Signature = mehtod name + parameters In method overloading METHOD
	 * SIGNATURE MUST BE DIFFERENT
	 * 
	 * ========================= Advantage of Method Overloading ==============================
	 * 
	 * 1.The main advantage of this is cleanliness of code. 
	 * 2.Method overloading increases the readability of the program. 
	 * 3. Flexibility 
	 * Overloaded methods give programmers the flexibility to call a similar method for
	 * different types of data. If you are working on a mathematics program, for example, you could use
	 * overloading to create several multiply classes, each of which multiplies a
	 * different number of type of argument: the simplest multiply(int a, int b)
	 * multiplies two integers; the more complicated method multiply(double a, int
	 * b, int c) multiplies one double by two integers -- you could then call
	 * "multiply" on any combination of variables that you created an overloaded
	 * method for and receive the proper result.
	 * 
	 * ======================================== Key Points: 
	 * we can overload static methods
	 * we can overload private methods
	 * 
	 * main method can be overloaded
	 * Constructors can be overloaded
	 * 
	 * Operator overloading (+) 
	 * with Strings --> behaves as concatenation operator
	 * with numbers --> behaves as math operator
	 */
	
	

}
