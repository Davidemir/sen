package com.class19;

public class ThisWithVariablesAndMethods {
	
	/*
	 * if we wanna use instance variables and (Counstructor) local variables 
	 * name as same we must use this keyword.
	 * (this.instance variableName = local variableName )
	 */
	
	int a, b;//instances variables
	
	ThisWithVariablesAndMethods(int a, int b){//local variables
		this.a = a;
		this.b = b;
	}
	
	ThisWithVariablesAndMethods(){
		System.out.println("I am non argument constructor");
	}
	
	public void sum(int a, int b) {
		// System.out.println("The sum of local parameters is "+  a+b );
		// System.out.println("The sum of instance parameters is "+   this.a + this.b  );
		
		//note: if u dont use parantesis a+b ==> The sum of local parameters is 1020
		//  this.a + this.b ==> The sum of instance parameters is 510
		
		
		System.out.println("The sum of local parameters is "+  (a+b)  );// => (a+b)==>  u must use parantesis
		System.out.println("The sum of instance parameters is "+   (this.a + this.b)  );
         //(this.a + this.b) ==> u must use parantesis
	}
	
	public void sayA() {
		System.out.println(a);//instance variable
	}
	
	
	public void sayB() {
		System.out.println(b);//instance variable
	}
	
	
	public void sayAandB() {//we used current method with instance method
		//we can call inside method to another method
		this.sayA(); //or sayA(); the same if u dont use this keyword compiler adds this keyword automatically
		sayB();//we did not use keyword compiler adds this keyword automatically ==> this.sayB();
	}
	
	
	public static void main(String[] args) {
		
		ThisWithVariablesAndMethods obj = new ThisWithVariablesAndMethods(5, 10); //for instances value
		obj.sum(10, 20); //for local value
		obj.sayA();//==> it call instances value ==> 5
		obj.sayB();//==> it call instances value ==> 10
		obj.sayAandB(); //==> it call instances value ==> 5 ,10
		
		ThisWithVariablesAndMethods obj1 = new ThisWithVariablesAndMethods(); //for instances value (it will be 0 coz we did not initiliaze any value)
		obj1.sum(100, 200);//for local value
		
	}

}
