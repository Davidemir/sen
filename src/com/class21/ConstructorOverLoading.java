package com.class21;

public class ConstructorOverLoading {
    
	//By changing number of parameters (different amount of paramters)
	ConstructorOverLoading(){
		System.out.println("I am non argument constructor");
	}
	
	
	
	ConstructorOverLoading(String str){
		System.out.println("I am constructor with 1 String paramter");
	}
	
	
	//By changing the data type (different type of parameters)
	ConstructorOverLoading(int num){
		System.out.println("I am constructor with 1 int paramter");
	}
}
