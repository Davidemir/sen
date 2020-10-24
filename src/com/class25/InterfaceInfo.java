package com.class25;

public class InterfaceInfo {
	
	/*
	 * ==> Interface is similar to class which is a collection of public static
	 * final variables and public abstract methods
	 *
	 * ==> The interface is a mechanism to achieve fully abstraction and multiple
	 * inheritance in java.
	 *
	 * ==> An interface is a bit like a class, except you can only declare methods
	 * and variables in the interface. You cannot actually implement the methods.
	 *
	 * ==> By using Interface, we can achieve multiple inheritance in java. It means
	 * one child can have multiple interface and parents.
	 *
	 * ==> It is implicitly abstract. So we no need to use the abstract keyword when
	 * declaring an interface.Each method in an interface is also implicitly
	 * abstract, so the abstract keyword is not needed.
	 * 
	 * ==> Methods in an interface are implicitly public.
	 *
	 * ==> All the data members of interface are implicitly public static final.
	 * Interface can not contain instance fields. Interface only contains public
	 * static final variables. The java compiler adds public and abstract keywords
	 * before the interface method and public, static and final keywords before data
	 * members.
	 * 
	 * 
	 * ==> Interface cannot be extended by a class; it is implemented by a class.
	 *
	 * ==> Interface can extend multiple interfaces. It means interface support
	 * multiple inheritance
	 *
	 * ==> An interface is not a class. Writing an interface is similar to writing a
	 * class, but they are two different concepts. A class describes the attributes
	 * and behaviors of an object. An interface contains behaviors that a class
	 * implements.
	 * 
	 * Unless the class that implements the interface is abstract, all the methods
	 * of the interface need to be defined in the class.
	 * 
	 * ==> An interface reference can point to objects of its implementing classes
	 * 
	 * ==> A class can implement more than one interface at a time.
	 * 
	 * ==> A class can extend only one class, but implement many interfaces.
	 * 
	 * ==> An interface can extend another interface,similarly 
	 * to the way that a class can extend another class.
	 * 
	 * =========  Relationship between class and Interface ==============
	 * 
	 * class to class ==> extends
	 * class to interface ==>implements
	 * interface to interface ==>extends


	 *
	 *
	 * ============================= When we use abstract and when Interface? =========================== 
	 * If we do not know any things about implementation
	 * and just have requirement specification then we should be go for Interface
	 *
	 * If we are talking about implementation but not completely (partially
	 * implemented) then we should be go for abstract
	 *
	 * Note: Prior to JDK 8, interface could not define implementation. Now we can
	 * add implemented default or static methods into interface. 
	 * ==>
	 * 
	 */

}
