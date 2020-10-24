package com.class25;

public interface TaskShape {
	
	/*
	 * Create an Interface 'Shape' with undefined methods as calculateArea and
	 * calculatePerimiter. Create 2 classes Circle & Square that implements
	 * functionality defined in the Shape Interface. Test your code.
	 */

	void calculateArea(double num);
	void calculatePerimiter(double num);
}

class Circle implements TaskShape {

	@Override
	public void calculateArea(double num) {
		System.out.println((3.14*(num*num)));
		
	}

	@Override
	public void calculatePerimiter(double num) {
		System.out.println((3.14*2)+num);
		
	}

}	

class Square implements TaskShape {

	@Override
	public void calculateArea(double num) {
		System.out.println(num*num);
		
	}

	@Override
	public void calculatePerimiter(double num) {
		System.out.println(num*4);
		
	}

}