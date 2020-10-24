package com.class03;

public class PrimititiveCasting {
	
	public static void main(String[] args) {
		
		double d=12;
		System.out.println(d);
		
		//int i=12.0;//compile give an error
		
		//widening or automatic or implicit casting examples:
		byte b=127;
		int i=b;
		System.out.println(i);
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//narrowing or explicit or manual casting examples:
		//which  type u convert to type ,write that type in parantesis
		
//		double d2=123.56;
//		int num2=d2;// compile give an error. Coz double is higher than int therefore we MUST add the (int).
		
		double d2=123.56;
		int num2=(int)d2;//which  type u convert to type ,write that type in parantesis
		System.out.println(num2);
		
//		int num3=1000;
//		byte b1=num3;// compile give an error. Coz int is higher than byte therefore we MUST add the (byte).
		
		int num3=1000;
		byte b1=(byte)num3;//which  type u convert to type ,write that type in parantesis
		System.out.println(b1);
		
		
	}

}
