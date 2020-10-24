package com.class02;

public class Task2 {
	
	public static void main(String[] args) {
		
		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		 * Your program should say. The _______ of 2 numbers ___ and ___ is equal to _____�?
		 */
		
		int num1=3;
		int num2=2;
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println("The add of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The sub of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The mult of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
		System.out.println("The div of 2 numbers "+num1+" and "+num2+" is equal to "+div);
		
		/*
		 * Write a program to and the square of the number 3.9
		 *  You program should say The square of the ____ is ____ “
		 */
		
		double d=3.9;
		double square=d*d;
		
	    System.out.println("The square of the "+d+" is "+square);
	    
	    /*
	     * Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
	     *  Your program should say. 
	     * The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __? 
	     */
		
	    int width=5;
	    int height=8;
	    
	    int area=width*height;
	    int perimeter=2*(width+height);
	    
	    System.out.println("The perimeter of a rectangle with width "+width+" and height "
	    +height+" is equal to "+perimeter+" and the area is "+area);
	    
	    //or
	    
	    String message="The perimeter of a rectangle with width "+width+" and height " 
	    		+height+" is equal to "+perimeter+" and the area is "+area;
	    
	    System.out.println(message);
	}

}
