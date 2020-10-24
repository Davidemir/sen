package com.class17;

public class Husky {
	//static variables has common properties.And it is outside the methods
	//if u change static variable it will effect ALL  VARIABLES
	static String breed = "Husky";
	static int paws = 4;
	static int tale = 1;
	
	//instances variables . if u change instances variable it will effect only that variable
	String name;
	String color;
	
	void display() {
		System.out.println("Puppy name is "+name+" and it is breed is "+breed);
	}
	public static void main(String[] args) {
		//we crate 2 objects
		Husky puppy1 =  new Husky();
		Husky puppy2 =  new Husky();
		
		puppy1.name = "Meatball";
		puppy1.color = "brown";
		puppy1.display();
		
		puppy2.name = "Lassy";
		puppy2.color = "black";
		puppy2.display();
		
		System.out.println("Changing breed"); 
		//if u change static variable it will effect ALL  VARIABLES(static, instances and local variables)
		Husky puppy3 =  new Husky();
		puppy3.name = "Lassy";
		puppy3.color = "black";
		puppy3.breed = "bulldog";
		//or
		breed = "bulldog";//it is preffered way
		puppy3.display();
		
		//displaying values from previous instances
		puppy1.display();//before breed was husky but now it will be bulldog
		puppy2.display();//before breed was husky but now it will be bulldog
	}

}
