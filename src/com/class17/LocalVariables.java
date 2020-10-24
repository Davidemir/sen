package com.class17;

public class LocalVariables {

	public static void main(String[] args) {
		
		//I want to access variable myName from different method
		
		//it is local variables
		LocalVariables local = new LocalVariables();
		local.sayName();
		//System.out.println(myName);==>wont't be accessible, scope is only within sayName method coz
				//it is sayName method local variables
		
		String s = local.createEmail("david", "iron", "gmail");
		System.out.println(s);
		
	}

	void sayName() {
		//it is local variables
		String myName = "John";
		System.out.println(myName);
		//System.out.println(obj);==>wont't be accessible, scope is only within main method coz
		//it is main method local variables
	}
	
	String createEmail(String name, String lastName, String email) {
		String userEmail = name + lastName + "@" + email + ".com";
		return userEmail;
	}
}
