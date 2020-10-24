package com.class23;

public class ThisAndSuperDifferencesInfo {

	/*
	 * ==> super() --> Calling Immediate Parent class constructor ALWAYS MUST be a 1
	 * line inside a constructor but super.methodName it can be any line. 
	 
	 * ==> this() --> calling CURRENT class constructor ALWAYS
	 * MUST be a 1 line inside a constructor
	 * 
	 * Can we have this() and super() together in 1 constructor? -NO
	 *  this constructor this() it must be 1 line like super constructor super()
		therefore this and super constructor can NOT use together
	
	 * ==> super. with variables & methods 
	 * super.variableName --> refers to the parent
	 * class variable (if parent class and child class have same variable name and
	 * you want to differentiate/access)
	 * 
	 * ==> this.variables --> refers to the current class variable (to differentiate/to
	 * access between instance and local)
	 * 
	 * this.methodName --> to call current class method 
	 * super.methodName --> to call parent class method
	 * 
	 * 
	 */
}
