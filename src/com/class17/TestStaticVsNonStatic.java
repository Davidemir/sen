package com.class17;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
		
		/*
		 * How to access static members within diffrent class===> they can be accessed by className
		 */

		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();

		/*
		 * How to access non static members within diffrent class===> they can be accessed by creating an
		 * Object of that class
		 */

		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name = "John";
		obj.grade = 'A';
		obj.getInfo();
		//obj.getInfo1();//we can access static method it is possible but, not preferable.
		
		System.out.println(obj.name);
		System.out.println(obj.grade);
	
	}
}
