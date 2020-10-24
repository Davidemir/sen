package com.class25;

public class TaskShapeTest {

	public static void main(String[] args) {
		
		TaskShape shape = new Circle();
		shape.calculateArea(10);
		shape.calculatePerimiter(10);
		
		System.out.println("..........................");
		
		TaskShape shape2 = new Square();
		shape2.calculateArea(5);
		shape2.calculatePerimiter(5);

	}

}
