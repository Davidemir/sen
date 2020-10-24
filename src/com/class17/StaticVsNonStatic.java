package com.class17;

public class StaticVsNonStatic {

	//template for a students ( school, name, grade )
	
	
	
	static String school = "Syntax";//static variable
	String name;//instance variable
	char grade;//instance variable
	
	//instance method Or Non static method ( we use instance variable and static variable)
	void getInfo() {
		System.out.println("My name is "+name+" and I am going to "+school+
				" and my grade is "+grade);
	}
	
	//static method( we use only static variable and static keyword  )
	static void getInfo1() {
		System.out.println("I am attending classes at "+school);
		// System.out.println("My name is "+name);
		/* compiler will give an error you CANNOT access NON static members within STATIC methods
		 */
	}
	
	public static void main(String[] args) {
		
		/*accessing static members within same class
		 * ==>just use name for a variable 
		 * OR call method by its name only
		 */
		System.out.println(school);
		getInfo1();
	}
}
