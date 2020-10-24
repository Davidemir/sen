package com.class08;

public class ForLoopPractice {
	
	public static void main(String[] args) {
		
        System.out.println("int sum=0; --> what is the output");
		
		int sum=0;
		for (int i=1;  i<=5; i++) {
			sum = sum + i;
			System.out.print(sum+ " + ");
		}
		System.out.println();
		System.out.println(sum);
		
		
		System.out.println("int sumAll=0; ===>what is the output");
		int sumAll=0;
		
		for (int i=0; i<=20; i+=5) {  
			sumAll=sumAll+i;
		}
		
		System.out.println(sumAll);
		
		
		
		System.out.println("int total=2; ===>what is the output");
		int total=2;
		
		for (int y=1; y<=3; y++) {
			total=total*y;
		}
		
		System.out.println(total);
		
		
	}

}
