package com.class03;

public class IfConditions {
	
	public static void main(String[] args) {
		
		int a=90;
		int b4=300;
		//if number a is bigger than number b4; I want to print a is larger than b4
		
		if(a>b4) {
			System.out.println("a is larger than b4");
		}else {
			System.out.println("a is smaller than b4");
	    }
		
		int expectedHours=15;
		int actualHours=2;
		//if expected hours are more than actual=>U will be succeed;otherwise, please study more
		
		if(expectedHours>actualHours) {
			System.out.println("You will be succeed");
		}else {
			System.out.println("Please study more");
		}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		//if Teaprice is more that I can afford but I will NOT buy
		//if Teaprice is less or matches what I can afford then I will buy tea
		
		if(teaPrice<=allowedPrice) {
			System.out.println("I will buy tea");
		}else {
			System.out.println("I can afford but I will not buy");
		}
		
		
		boolean val=false;
		
		if(val==true) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		boolean isRain=false;
		//if it is raining I will take umbrella, if it is not I will not take umbrella.
		
		if(isRain==true) {
			System.out.println("I will take umbrella");
		}else {
			System.out.println("I will NOT take umbrella");
		}
	}	
}
