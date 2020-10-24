package com.class30;

public class ExceptionInfo {

	/*
	 * Exception - unwanted, unexpected event that disrupt the flow of the program/application
	 * Exception is an object which is thrown at runtime.When Exception occurs system generates an
	 * error message. We can manage this using exception handler. 
	 * The process of converting system error messages into user friendly error message is known as
	 * Exception handling.
	 * 
	 * ALL EXCEPTION OCCUR ONLY AT THE RUN TIME
	 * 
	 * Parent of all exception is a Throwable class We have 2 types of throwable
	 * objects/classes:
	 * 
	 * 1. Error - smth that we cannot handle (out of memory error --> will occur
	 * because of lack of the system resources) for example : OutOfMemoryError
	 * 
	 * 2. Exception - is an object that is thrown at the runtime and this object we can
	 * handle.
	 */
	
	/*================ 2 type of Exception: =================
	 * 1. checked - compile time exceptions -> occur during
	 * compalation and you will HAVE to handle it, otherwise your code won't compile
	 * 
	 * ==>ClassNotFoundException Class not found
	 * ==>InstantiationException Attempt to create an object of an abstract class or interface
	 * ==>IllegalAccessException Access to a class is denied.
	 * ==>SQLException Database access error
	 * ==>FileNotFoundException Attempt to open file at specified path has failed

	 * 2. unchecked - this type of exception not checked by the compiler
	 * ==>If we divide any number by zero, there occurs an ArithmeticException.
          int a=50/0;//ArithmeticException
	 * 
	 * ==>If we have null value in any variable, performing any operation by the variable
         occurs an NullPointerException.
         String s=null;
         System.out.println(s.length());//NullPointerException
         
	 * ==>If you are inserting any value in the wrong index, it would result ArrayIndexOutOfBoundsException
          int a[]=new int[5];
          a[10]=50; //ArrayIndexOutOfBoundsException

	 * ==>StringIndexOutOfBoundsException an index is either negative or greater than the size of the string.
	 * ==>NegativeArraySizeException Array created with a negative size.

	 */
	
	
	/*
	 * =================== Java Exception Handling Keywords ========================
	 * Exception handling keywords/block: try -->catch, finally, throw,throws
	 * 
	 * try - block of code hat might throw an exception catch - block that catches a
	 * matching object of the exception
	 * 
	 * we can have multiple catch blocks associated with the try block. During
	 * runtime only 1 corresponding catch block will get executed When we create
	 * muptiple catch blocks we should specify order of catch block from specific to
	 * general
	 * 
	 * finally - block of code that is associated with try block and it will always
	 * execute whether Exception occurs or not Usually we put "clean up" inside
	 * finally block Finally block will not handle the Exception, only catch block
	 * catches the actual exception
	 * 
	 * Real Life Example Establish Database connection
	 * 
	 * try { retrieve data;
	 * 
	 * }catch (SQLException e){ 
	 *        e.getMessage(); 
	 *        
	 * }finally{
	 *   close DataBase connection; 
	 *   
	 * }
	 * 
	 * We can have multiple catch block associated with 1 try, but we can have only
	 * 1 finally block per 1 try
	 * 
	 * throws - is a keyword that delegetes responsibility to handle the exception
	 * to the caller/method that calls throws is associated with checked exception
	 * Compiler will give 2 options when checked exception occurs 1. use try & catch
	 * - handle the exception 2. throws - do not hande it now and pass it to whoever
	 * calls that method
	 * 
	 * throw - is a keyword that used to throw actual Exception
	 * 
	 */
	
	

	
	/*
	 * ============= final vs finally ================ 
	 * 1. Final is used to apply restrictions on class, method and variable. 
	 * Final class can't be inherited,final method can't be overridden and 
	 * final variable value can't be changed.
	 * 
	 * ==> Finally is used to place important code, it will be
	 * executed whether exception is handled or not.
	 * 
	 * 2. Final is a keyword. ==>Finally is a block.
	 */
	
	
	/* ================ throw vs throws ===================
	 * 1. throw is used to explicitly throw an exception while throws is used to declare an exception.
	 * 2. throw is followed by an instance while throws is followed by class
	 * 3. throw is used within the method body while throws is used with the method signature.
	 * 4. You cannot throw multiple exception 
	 * while You can declare multipleexception e.g.
       public void method()throws IOException,SQLException.
       
       5. throw keyword can be used in switch case in Java while throws keyword can not be
       used anywhere except on method declaration line.

	 */
	
	
	
	/*
	 * Inside Throwable class we can use 3 methods to call and get details on the exception
	 * 
	 * 1. .printStackTrace (where, name, message) 
	 * 2. SOPln(Exception object) (name,message) 
	 * 3. .getMessage();(message)
	 * 
	 */

}
