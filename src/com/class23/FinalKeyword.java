package com.class23;

public final class FinalKeyword {
    //We can use access modifier for final but it must be out of methods.
	//final can be use with variable
	public final String str = "Hello";
	
	public static void main(String[] args) {
		
		String str = "I am awasome";
		//we can change the value
		str = "I am cool";
		System.out.println(str);//execute will be I am cool
		
		final String finalString = "Java is easy";
	    //finalString = "Java is hard";//compile will give an error coz final is the last value
		//it means we can not change value. cannot modify final variable
		
		final int age = 120;
		//age = 100;//==> compile error(c.e)
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.str);
		
		//Can we overload a final method ===> YES
		obj.hello();
		obj.hello("Adam");
		obj.hello("Adam", 10);
		
		
		
	}
	
	public final void hello() {
		System.out.println("I am a final method in Parent class");
	}
	
	//Can we overload a final method ===> YES
	public final void hello(String str) {
		System.out.println("I am a final method in Parent class "+str);
	}
	
	public final void hello(String str, int num) {
		System.out.println("I am a final method in Parent class "+str+" "+num);
	}
}

//class  FinalKeywordChild extends  FinalKeyword{
	//final methods cannot be overriden , we will get COMPILE ERROR (c.e)
//	public final void hello() {
//		System.out.println();
//	}

