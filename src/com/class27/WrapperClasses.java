package com.class27;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		int num = 10;//==>primitive type
		
//******** Autoboxing ==> converting primitive type into an Object type(non primitive types) ************
		//converting int primitive type into Integer Object type
		Integer inter = 1000000;
		//when u use the autoboxing u can access all specific methods
		//inter. can access all specific methods
		System.out.println(inter.MIN_VALUE);
		//I can change Integer to String
		String str = inter.toString();
		System.out.println(str);
		
		//converting boolean primitive type into Boolean Object type
		Boolean bool = true;
		
		//converting byte primitive type into Byte Object type
		Byte b = 20;
		System.out.println(b.MAX_VALUE);
		
//********* AutoUnboxing ==> converting Object type(non primitive types) into an primitive type **********
		int num1 = new Integer(10);
		System.out.println(num1);
		//when u use the autoUNboxing u canNOT access ANY specific methods
		//num1. u canNOT access ANY specific methods
		
	}

}
