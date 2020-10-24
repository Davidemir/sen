package com.class17;

public class InstanceVariables {

		//instance variable coz it is outside methods
		String name = "Samir";//if we dont initiliaze value output==> null
		
	
	public static void main(String[] args) {
		//local variable coz it is inside the methods
		String name = "Jack";
		System.out.println(name);//jack
		
		
		InstanceVariables obj = new InstanceVariables();//if u wanna see  SAmir for output u must create the object.
		System.out.println(obj.name);//samir
		//changing value of instance variable
		obj.name = " Joe";
		System.out.println(obj.name);
		
		
		//value will be Samir
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		//changing value of instance variable
		obj1.name = "Dave";
		System.out.println(obj1.name);
	}

}
