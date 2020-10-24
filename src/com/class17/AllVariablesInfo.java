package com.class17;

public class AllVariablesInfo {
	
	/*
	 * ===================== VARIABLES ========================
	 * 
	 * Variables are used to store information to be referenced and manipulated in a
	 * computer program. 
	 * Variable is name of reserved area allocated in memory. In
	 * other words, it is a name of memory location. 
	 * Value of the variable can change, depending on conditions or 
	 * on information passed to the program.
	 * variable="vary + able" that means its value can be changed.
	 * 
	 * The type is one of Java’s primitive types or the name of a class or interface. 
	 * The identifier is the name of the variable. 
	 * You can initialize the variable by specifying an equal sign and a value. 
	 * You can initialize the variable by specifying an equal sign and a value. 
	 * The initialization expression must result in a value of the same 
	 * (or compatible) type as that specified for the variable. 
	 * To declare more than one variable of the specified type, use a comma separated list.
	 */
	
	
	/*
	 * Types of variables in Java:
	 *  1. Local variables. 
	 *  2. Instance variables. 
	 *  3. Static variables.
	 */
	
	
	/*/////////////////////////////////////////////////
	 * ============== Local Variable =================
	 * ***********************************************
	 * note : when u declare local u must be initialize it if u dont it, compile will give an error.
	 * 
	 * ==> Variables declared inside the class and inside the method. 
	 * The scope of the variable is only within THAT method.
	 * 
	 * ==> The variables which are declare inside a method or constructor or blocks
	 * those variables are called local variables.
	 *  
	 * ==> It is possible to access local variables only inside the method or 
	 * constructor or blocks only, it is not possible to access outside of 
	 * method or constructor or blocks. 
	 * 
	 * ==> Local variables memory allocated when method starts & memory 
	 * released when method completed. 
	 * 
	 * ==> Local variables are declared in methods, constructors, or blocks. 
	 * 
	 * ==> Local variables are created when the method, constructor or block
	 * is entered and the variable will be destroyed once it exits the method,
	 * constructor, or block. 
	 * 
	 * ==>Access modifiers cannot be used for local variables.
	 *  
	 * ==> A variable declared inside the body of the method is called local variable. 
	 * 
	 * ==> You can use this variable only within that method and the
	 * other methods in the class aren't even aware that the variable exists. 
	 * 
	 * ==> A local variable cannot be defined with "static" keyword.
	 */
	
	
	
	
	
	
	/*////////////////////////////////////////////////////////////////////////////
	 * ============================ Instance Variable ===========================
	 ****************************************************************************
	 * note : when u declare instance variable u cannot be initialize it if u dont it, 
	 * compile will execute null value.
	 * 
	 * ==> A variable which is declared inside the class but outside the method is called instance variable. 
	 * It is not declared as static. 
	 * 
	 * ==> When we create an Instance of the class (object of the class) copy of
	 * each instance variables will be given to each object (instance).
	 * 
	 * ==> The methods and variables defined within a class are called members of the class. 
	 * 
	 * ==> Why the name is instance: Variables defined within a class are called instance variables
	 * because each instance of the class (that is, each object of the class)
	 * contains its own copy of these variables. 
	 * 
	 * ==> Thus, the data for one object is separate and unique from the data for another. 
	 * 
	 * ==> It is called instance variable because its value is instance specific 
	 * and is not shared among instances. 
	 */
	
	/*
	 * =================== Important Points about Instance Variable ========================
	 * 
	 * ==> Instance variables are used in a class, but outside a method, constructor or
	 * any block. 
	 * 
	 * ==> A slot for each instance variable value is created, when space is
	 * allocated for an object in the heap. 
	 * 
	 * ==> Instance variables can be declared in the class level before or after use.
	 */
	
	
	
	
	
	
	
	
	
	/*///////////////////////////////////////////////////////////
	 * ==================== Static variable =====================
	 ***********************************************************
	 *
	 * ==> Variables defined inside the class but outside ANY method, constructor or block
	 * 
	 * ● A variable which is declared as static is called static variable. 
	 * 
	 * ● Static variables are also known as class variable because they are associated with
	 * the class and common for all the instances of class. 
	 * 
	 * ● It cannot be local. 
	 * 
	 * ● You can create a single copy of static variable and share among all the
	 * instances of the class. 
	 * 
	 * ● Memory allocation for static variable happens only
	 * once when the class is loaded in the memory.
	 * 
	 * ● Class variables also known as static variables are declared with 
	 * the static keyword in a class, but outside a method, constructor or a block. 
	 * 
	 * ● Static variables store values for the variables in a common memory location. 
	 * 
	 * ● Because of this common location, if one object changes the value of a static variable, 
	 * all objects of the same class are affected. 
	 * 
	 * ● Use the static variable for the property that is common to all objects. 
	 * For example, in class Student, all students shares the same college name. 
	 * 
	 * ● Use static methods for changing static variables.
	 * 
	 * 
	 * 
	 * =============== Static keyword ==================
	 * 
	 * ==> Static is a keyword.
	 * ==> Static keyword can be used with variables, methods and blocks
	 * 
	 * ● static is a non-access modifier in Java. 
	 * 
	 * ● static keyword can be used with variables, methods, blocks and nested class. 
	 * 
	 * ● static keyword belongs to the class than an instance of the class. 
	 * 
	 * ● static methods can access all static variables and other static methods. 
	 * 
	 * ● static methods cannot access instance(non static)
	 * variables and methods directly; they need some object reference to do so
	 */

}
