package com.class24;

public class AbstractionInfo {
	
	/*
	 * ====== Abstraction - is a process of hiding implementation details and showing only
	 * functionality . 
	 * 
	 * Abstract class:
         implemented and unimplemented methods
	     implemented - static & non static
	     unimplemented = abstract = no body
	     abstract methods -NO STATIC, NO FINAL, NO PRIVATE
      Constructor
      instance and static variables
	 * 
	 *=============== Real Life Example of Abstraction: =====================
	 * Abstraction shows only important things to the user and hides the internal 
	 * details for example when we ride a bike, we only know about how to ride bike but can not know about
	 * how it work ? and also we do not know internal functionality of bike. Or
	 * sending sms, you just type the text and send the message. You don't know the
	 * internal processing about the message delivery.
	 * 
	 * ================= In Java Abstraction can be achieved in 2 ways: ================
	 *1.  Abstract class (0 to 100% or partial abstraction)
	 *2.  Interfaces (Achieve 100% abstraction or full abstraction)
	 * 
	 *================= Java programming we have two types of classes: =================
	 *1. Abstract class: is one which is declared with abstract keyword and can contain
	 *defined methods(methods that have body) and undefined method (methods that do not have body).
	 *
	 *2. Concrete class :child class will provide all implementions  from abstract class
	 *
	 *=============== WHAT is the diffrences between Concrete class and Abstract Class? =====================
	 * 1. Concrete class are used for specific requirement 
	 * but Abstract class are used for fulfill common requirement.
	 * 
	 * 2. Object of concrete class can be create directly 
	 * but Object of abstract class cannot be created directly (can create indirectly).
	 * 
	 * 3. Concrete class containing fully defined methods or implemented method,
	 * but Abstract class have both undefined method and defined method.
	 * 
	 * 
	 * abstract is a non access modifier that can be used with methods and classes.
	 * is a keyword that identifies smth in incomplete.
	 * 
	 * ==========!!!!!!!!!!!!! Create an Object = Create an Instance = Instantiate the class!!!!!!!!!!!!!!!!!!!
	 * 
	 * 
	 * 
	 * Undefined/unimplemented/ abstract methods --> methods without the body
        public abstract void takePictures();

        below method is not abstract as it has a body {},
        you will get a compiler errror u must remove abstract keyword or body{}
        public abstract void takePictures(){}
	 * 
	 * ===================== Advantage of Abstract class ===========================
	 *                                 (karmaşa)                      (sürdürülebilirlik)
	 * Abstraction helps to reduce the complexity and also improves the maintainability of the system.
	 * Combining abstraction with the concepts of the Encapsulation and Polymorphism, 
	 * it gives more power to the Object oriented programming languages.
	 * 
	 * ======================= Abstract Rules =======================
	 * 1. Class that is declared with abstract keyword, is known as abstract class.
	 * An abstract class is one which is containing some defined method and some undefined method. 
	 * 
	 * 2. Class is declared abstract, it cannot be instantiated/ cannot create an object of it.
	 * 
	 * 3. In Java programming undefined methods are known as un-implemented or abstract method.
	 * 
	 * 4. To utilize an abstract class, we have to inherit it from another class and 
	 * provide implementations for the abstract methods in it. 
	 * (It needs to be extended and its method implemented.)
	 * 
	 * 5. If we inherit an abstract class, we have to provide implementations 
	 * for all the abstract methods in it.
	 * 
	 * 6. Can an abstract method be private? NO!!! coz private can not be inherited.
	 * 
	 * 7. Can an abstract method be final??? NO!!! coz final can not change value and we can not override.
	 * 
	 * 8. Can an abstract method be static? NO!!!  coz we can not override static.
	 * 
	 * 9. Can an abstract class has a Constructor?? Yes. You can explicitly(manual) provide constructor
	 * to absract class or if u dont it, compiler will add default constructor of non
	 * argument in abstract class.
	 * 
	 * 10. Can an abstract class has a static & non static variables? Yes
	 */

}
