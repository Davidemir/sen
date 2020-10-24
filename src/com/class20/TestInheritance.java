package com.class20;

public class TestInheritance {

	public static void main(String[] args) {
		
		ChildInheritance child = new ChildInheritance();
		System.out.println(ChildInheritance.race);//race is static variable therefore we can use classname.race
		
		//or
		System.out.println(child.race);//or we can use with object
		System.out.println(child.hairColor);
		System.out.println(child.eyeColor);
		child.sing();
		child.code();
		
		
		Child2Inheritance child2 = new Child2Inheritance();
		System.out.println(Child2Inheritance.race);
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.swim();
		child2.soccer();
		child2.studying();
		child2.sing();
//		child2.code(); compiler give an error coz child class can not access child class
		
		
		ParentInheritance parent = new ParentInheritance();
		System.out.println(ParentInheritance.race);//race is static variable therefore we can use classname.race
		//or
		System.out.println(parent.race);//or we can use with object
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		parent.sing();
		//parent.code(); compiler give an error coz parent class can not access child class
		//but child class can access parent class.
		
	}
}
