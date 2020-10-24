package com.class14;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {
	
	/*
	 * =====Method in Java========
	 * 
	 * ● A Java method is a collection of statements that are grouped together to
	 * perform an operation 
	 * ● Method describes behavior of an object 
	 * ● Method contains a block of code 
	 * ● You can say a method is a subprogram that acts on
	 * data and often returns a value. 
	 * ● Java methods must be located inside a Java class.
	 * 
	 * ========= There are 2 types of Methods in JAVA ================ 
	 * 1.built in -limited and we cannot modify them 
	 * 2.user defined - unlimited and modifyable
	 * 
	 * we CANNOT create a method inside another method
	 * 
	 * ● Modiﬁers: The modiﬁer, which is optional, tells the compiler how to call the
	 * method. 
	 * 
	 * ● Return Type: A method may return a value. The return Value Type is
	 * the datatype of the value the method returns.
	 * 
	 * ● Method Name: This is the actual name of the method. 
	 * 
	 * ● Parameters: This value is referred to as actual parameter or argument. 
	 * The parameter list refers to the type, order, and number of the
	 * parameters of a method. Parameters are optional; that is, a method may
	 * contain no parameters. 
	 * 
	 * ● Method Body: The method body contains a collection of
	 * statements that deﬁne what the method does. 
	 * 
	 * ●●● Note: In certain other languages, methods are referred to 
	 * as procedures and functions. A method with a non void
	 * return value type is called a function; a method with a void return value
	 * type is called a procedure
	 * 
	 */

	public static void main(String[] args) {
        
		//built in (coz all this methods was writen inside java automatically.
		//replace, charAt, nextLine(), nextInt();...........
		String str = "Hello";
		str = str.replace("Hello", "hi");
		System.out.println(str);
		
		Scanner scan = new Scanner(System.in);
		String scannerString = scan.nextLine();
		System.out.println(scannerString);
		
		BuiltAndUserDefinedMethods obj = new BuiltAndUserDefinedMethods();
	}
	
	void myMethod() { //==>method header
		//method body ==> (everyhting insides the blocks { }
		System.out.println("This is user defined method that I created ");
	}
}
