package com.class16;

public class AccessModifierInfo {
	
	
	/*///////////////////////////////////////////////////////////////////////
	 *  ======================= Modifiers in Java ========================== 
	 *  *********************************************************************
	 *  note we can not use inside the local variable.
	 *  
	 *1.  Access modifiers -> applicable for variables, methods, constructor or class
	 *==>Access modiﬁers are always used to control the reuse of features 
	 *within a package and access between classes , interfaces and interface to class. 
	 *==>Access modiﬁers provides features accessing and controlling 
	 *mechanism among classes and interfaces

	 
	 * 4 types of access modifiers: 
	 * ● private ==> native class
	 * ● default ==> package  Note: Default is not a keyword (like public, private, protected are keyword) 
	 * ● protected ==> inherited 
	 * ● public ==> universal (making variables and method be accessible in the entire project)
	 * 
	 * Within Same Class ==> all of them
	 * From Any Class in Same Package ==> public , protected and default
	 * From Any Class from Different Package ==> public and protected(Only By Inheritance)
	 * From Any Class in Different Package ==> only public
	 * 
	 * SYNTAX  for Variables: 
	 *       optional     optional         MUST         MUST 
	 * access modifier non-access mod   dataType    variableName;
	 * 
	 * SYNTAX  for Methods:
	 *   optional            optional       MUST         MUST
	 *  access modifier  non-access mod   returnType   methodName;
	 * 
	 * 
	 * 2. Non Access Modiﬁers 
	 * 
	 * 4 types of non-access modifiers:
	 * ● static 
	 * ● ﬁnal 
	 * ● abstract 
	 * ● synchronized
	 */
	
	
	/*  ======Default modifier=====
	 * 
	 * 1. ==> If we are not using private , protected and public keywords then 
	 * JVM is by default taking as default access modifiers.
	 * 
	 * Note: Default is not a keyword (like public, private, protected are keyword).
	 * 
	 * 2. ==> The scope of this modifier is limited to the package only. 
	 * This means that if we have a class with the default access modifier in a package, 
	 * only those classes that are in this package can access this class. 
	 * No other class outside this package can access this class.
	 * 
	 * 3. ==> Similarly, if we have a default method or data member in a class, 
	 * it would not be visible in the class of another package.
	 * 
	 * 4. ==> The data members, class or methods which are not declared using any 
	 * access modifiers i.e. having default access modifier is accessible to 
	 * the classes which are defined in the same package.
	 */
	
	
	/*  ======Public modifier=====
	 * 
	 * if a variable is set to the public it can be accessed from any class 
	 * available in the Java world. Any Method in any Class can access the
	 * given variable via Inheritance or Direct access.
	 */
	
	
	/*  ======Protected modifier=====
	 * 
	 * 1. ==> If a variable is set to protected inside a Class, 
	 * it will be accessible from its subclasses defined in the same 
	 * or different package only via Inheritance.
	 * 
	 * 2. ==> Protected data member and method are only accessible by 
	 * the classes of the same package and the subclasses present in any package.
	 * 
	 * 3. ==> This access modifier is generally used in a parent child relationship.
	 * 
	 * 4. ==> The methods or data members declared as protected are accessible within 
	 * same package or sub classes in the different package. 
	 * 
	 * 5. ==> The protected access modifier can be applied on the 
	 * data member, method and constructor. It can't be applied on the class.
	 */
	
	
	/*  ======Private modifier=====
	 * 
	 * 1. ==> A variable defined private will be accessible only from within 
	 * the Class in which it is defined. Such variables are not accessible 
	 * from outside the defined Class, not even in its subclass.
	 * 
	 * 2. ==> Private Data members and methods are only accessible within the class
	 * 
	 * 3. ==> Class and Interface cannot be declared as private
	 * 
	 * 4. ==> If a class has private constructor then you cannot create the object of 
	 * that class from outside of the class.
	 * 
	 * 5. ==> Any other class of the same package will not be able to access these members.
	 */

}
