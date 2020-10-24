package com.class20;

public class InheritanceInfo {
	
	/*
	 * ========================= Inheritance ==========================
	 * Note : every class in java has a parent class.
	 * 
	 * ==> Inheritance in java is a mechanism in which one object acquires all the
	 * properties and behaviors of parent object.
	 * 
	 * ==> Main idea behind inheritance in java is that you can create new classes
	 * that are built upon existing classes.
	 * 
	 * ==> When we inherit from an existing class, we can reuse methods and fields
	 * of parent class, and we can add new methods and fields also.
	 * 
	 * ==> extends is the keyword used to inherit the properties of a class.
	 * 
	 * 
	 * Syntax of Inheritance :
	 * class Subclass-Name extends Superclass-Name { 
	 * //methods and fields 
	 * }
	 * 
	 * Parent Class / Super Class /Base Class 
	 * Child Class / Sub Class / Derived Class
	 */

	
	/**
	 * ========================= Advantage of Inheritance ==========================
	 * 
	 * If we develop any application using concept of Inheritance then that
	 * application have following advantages:
	 * 
	 * 1. Application development time is less. 
	 * 2. Application take less memory. 
	 * 3. Application execution time is less.
	 * 
	 * ==> Code reusability: the same methods and variables which are defined in a
	 * parent/super/base class can be used in the child/sub/derived class.
	 * 
	 * ==> Application performance is enhanced (improved). 
	 * 
	 * ==> Redundancy (repetition) of the code is reduced 
	 * or minimized so that we get consistent results and less
	 * storage cost. 
	 */
	
	
	/**
	 * ========================= Disadvantage of Inheritance ==========================
	 * 
	 * The main disadvantage of using inheritance is that the two classes (parent
	 * and child class) get tightly coupled. ==> This means that if we change the code
	 * of parent class, it will affect to all the child classes which are
	 * inheriting/deriving the parent class, and hence, it cannot be independent of
	 * each other.
	 */
	
	
	/*
	 * ========================= Type of Inheritance ==========================
	 * 
	 * 1. Single  inheritance ==> 1 parent 1 child 
	 * 2. Hierarchical  inheritance ==> 1 parent multiple children 
	 * 3. Multilevel  inheritance ==>  grandparent - parent - child
	 */
	
	
	
	/*
	 * =========================== What is not possible in Inheritance? ===========================
	 * 
	 * Private variables and methods are not inherited (they wont available/visible
	 * in the subclasses)
	 * 
	 * Default variables and methods are available to the child class that is
	 * defined ONLY within SAME package
	 * 
	 * Protected variables and methods are available to the child class defined in
	 * DIFFERENT package
	 * 
	 * Are the constructor getting inherited? -NO
	 * 
	 * A subclass can extends only one superclass
	 * 
	 * A subclass can not extends a subclass
	 * 
	 * A superclass can not extends subclass 
	 * 
	 */
}
