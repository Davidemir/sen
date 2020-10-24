package com.class15;

public class MethodWithVoidValue {
	
public static void main(String[] args) {
	

	MethodWithVoidValue obj = new MethodWithVoidValue();
	obj.sum(10, 20);
	obj.largestNum(20, 10);
		
	}

	//method name==>sum  , //int num1, int num2==>parameters
	void sum(int num1, int num2) {//==>method header
		
		int c = num1 + num2;
		
		System.out.println(c);
	}//method body { }
	
	
	//find largest number
	void largestNum(int num1, int num2) {
		
		int largest;
		
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
		
		System.out.println("Largest number is :"+largest);
	}
	

	
}
