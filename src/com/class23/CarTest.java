package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Tesla tesla =new Tesla();
		
		Tesla tesla1=new Tesla("Tesla", "S4", true);
		tesla1.displayInfo();
		
		
		System.out.println("--------------Creating another object-----------------------");
		Tesla tesla2=new Tesla("Tesla  XL", "S8",false);
		
		tesla2.displayInfo();
		
		
	}
	
	
}