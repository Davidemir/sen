package com.class05;

public class LogicalNot {
	
	public static void main(String[] args) {
		
		boolean b=true;
		boolean b1=!true;//false
		boolean b2=false;
		boolean b3=!false;//true
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		boolean traffic=true;
		
		if(!traffic) {//meaning there is not traffic
			System.out.println("On time");
		}else {
			System.out.println("Late");
		}
		
		
		boolean isRain=false;
		
		if(!isRain) {//there is raining
			System.out.println("I will take umbrella");
		}else {
			System.out.println("I will goint to swimming");
		}
		
		//let's compare 2 numbers using NOT operator
		
		
		//FIRST WAY
		
		int num1=10;
		int num2=11;
		
		if(num1==num2) {
			System.out.println("Numbers are equal");
		}else {
		    System.out.println("Numbers are NOT equal");
		}
		
		
		//SECOND WAY
		      //false add (!)NOT (it reverts the condition-->it change the opposite condition) ==>true
		if(!(num1==num2)) {//meaning is num1 is not equal to num2. 
			      //!(NOT OPERATOR) must be outside (num1==num2) and it must be 2 parantesis
			System.out.println("Numbers are NOT equal");
		}else {
		    System.out.println("Numbers are equal");
		}
		
		
		//if name not Marry or Anna then you are not my sister
		String name1="Marry";
		String name2="Anna";
		           //true OR true-->true add NOT(it reverts the condition-->it change the opposite condition)==>false
		if(!(name1.equals("Mary") || name2.equals("Anna"))) {//meaning name is not equal to Mary or Anna.
	//!(NOT OPERATOR) must be outside (name1.equals("Mary") || name2.equals("Anna")) and it must be 3 parantesis
			System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
		}
	}

}
