package com.class07;

public class FibonacciWithWhileLoop {

	public static void main(String[] args) {
		
		int maxNum = 10, previousNum = 0 , nextNum = 1;
		System.out.println("Fibonacci serious of "+maxNum+" numbers: ");

		int i = 1;
		
		while(i<=maxNum) {
			System.out.println(previousNum+" ");
			int sum = previousNum+nextNum;
			previousNum=nextNum;
			nextNum=sum;
			i++;
		}
	}

}
