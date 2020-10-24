package com.class15;

public class MethodWithReturnValue {
	
	public static void main(String[] args) {
		
		
		MethodWithReturnValue obj = new MethodWithReturnValue();
		int sum = obj.sum(10, 20);
		//in void method we only wrote obj.sum(10, 20); but in return tpye u must write 
		//return type and any name
		System.out.println(sum);// in void method sout must we under methods but in return tpye
		//it must be under the Object.
		
		
		int l= obj.largestNum(20, 10);
		System.out.println("Largest number is :"+l);
		
		}
	
	
	//void sum(int num1, int num2) {// ==>method header
	
	//return type==>int, method name==> sum, int num1, int num2==>list of parameters
	int sum(int num1, int num2) {// ==>method header

		int c = num1 + num2;
        /*in here return tpye==> int and variable name==> c
         * return type must change with void(delete void and write return type name)
         * delete sout in here and write under the Object(it is in main method)
         * instead of sout u must write return variableName;
		*/
		//System.out.println(c);
		return c;
	}// method body { }
	
	
	int largestNum(int num1, int num2) {

		int largest;

		if (num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}

		// System.out.println("Largest : "+largest);
		return largest;
	}
	
}
