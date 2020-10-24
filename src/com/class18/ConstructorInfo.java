package com.class18;

public class ConstructorInfo {
	
	/*
	 * =================== Constructor =================
	 * 
	 * In Java, a constructor is a block of codes similar to the method. 
	 * 
	 * It is called when an instance of the object is created, 
	 * and memory is allocated for the object. 
	 * 
	 * It is a special type of method which is used to initialize the object. 
	 * 
	 * !!!!!!!!!!!!!!!!!NOTE: If there is no constructor in a class, compiler automatically
	 * creates a default constructor. 
	 
	 
	 
	 * Object creation syntax: 
	 * 
	 * Test t = new Test(); 
	 * Test ---> class Name 
	 * t ---> Reference variables 
	 * = ---> assignment operator 
	 * new ---> keyword used to create object 
	 * Test() ---> constructor ; 
	 * ; ---> statement terminator(end of statement)
	 * 
	 * When we create instance (Object) of a class using new keyword, a constructor
	 * for that class is called. 
	 * ● New keyword is used to create object in java. 
	 * ● When we create object by using new operator after new keyword that part is
	 * constructor and it is executing a constructor.
	
	
	
	 * =====================How can we create a Constructor ?(Rules to declare constructor:)
	 *  1. Constructor name class name must be same. 
	 *  2. It is possible to provide parameters to constructors (just like methods). 
	 *  3. Constructor not allowed explicit return type even void.
	 
	 
	 * ==================== How constructor is executed:
	 * Everytime when we creat an object we call a constructor and entire block of code 
	 * inside the constructor will be executed first
	 * If we do not create any constructor--> compiler will create 1 default constructor


       ======================Why do we need a constructor?
       1. Constructor initialize OBJECT
       2. Constructor can intialize instance variables
       
       =============Can we use Access Modifiers( public, protected, default, private) with the constructors?
        Yes

       ============= Can we use NON access modifiers( static, final, abstract) with the constructors?
         NO

       
	 * ================There are two types of constructors: 
	 *  1. Non argument () 
	 *  2. Parameterized
	 
	 
	 
	 * ========================Non Argument Constructor (if it has not parameter)=========================
	 *  ● Inside the class if we are not declaring any constructor then compiler 
	 *  generates zero argument constructors with empty
	 * implementation at the time of compilation is called default constructor.
	 * 
	 *  ● The compiler generated constructor is called default constructor. 
	 *  
	 *  ● Inside the class default constructor is invisible mode. 
	 *  
	 *  ● The purpose of default constructor is to provide the default values 
	 *  to the object like 0, null etc. depending on the type.
	 
	 
	 ======================== Parameterized constructor (if it HAS PARAMETER)=========================
	 * ● If any constructor contain list of variable in its signature is known as
	 * Parameterized Constructor . A parameterized constructor is one which takes some parameters. 
	 * 
	 * ● Parameterized constructor is used to provide different values to the distinct objects.
	 
	 
	 
	 * ============================Important points ================================
	 * ● Whenever we create an object using parameterized
	 * constructor, it must be define parameterized constructor otherwise we will
	 * get compile time error. 
	 * 
	 * ● Whenever we define the objects with respect to both
	 * parameterized constructor and default constructor, It must be define both the
	 * constructors. 
	 * 
	 * ● In any class maximum one default constructor but 'n' number
	 * of parameterized constructors.
	 * 
	 * Parameterized Constructor :
	 * class Test { 
	 * int a, b; 
	 * Test(int n1, int n2) {
	 * SOP("I am from Parameterized Constructor..."); 
	 * a=n1; b=n2;
	 * SOP("Value of a = "+a); 
	 * SOP("Value of b = "+b); 
	 * } 
	 * }; 
	 * class TestDemo1 { 
	 * public static void main(String k []) { Test t1=new Test(10, 20); 
	 * } 
	 * }
	 
	 
	 
	 *===================== Rules or properties of a constructor =====================
	 *
	 *1. Constructor will be called automatically when the object is created. 
	 *
	 *2. Constructor should not return any value even void also. 
	 * Because basic aim is to place the value in the
	 * object. (if we write the return type for the constructor then that
	 * constructor will be treated as ordinary method). 
	 * 
	 * 3. Constructor definitions should not be static. 
	 * Because constructors will be called each and every
	 * time, whenever an object is creating.
	 *
	 * 4. Constructor should not be private provided an object of one class 
	 * is created in another class (Constructor can
	 * be private provided an object of one class created in the same class). 
	 * 
	 * 5.Constructors will not be inherited from one class to another class (Because
	 * every class constructor is create for initializing its own data members).
	 */

}
