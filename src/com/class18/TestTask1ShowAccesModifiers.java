package com.class18;

public class TestTask1ShowAccesModifiers {
	
public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		Task1 task2 = new Task1("hello");
		Task1 task3 = new Task1(3);
		//Task1 task4 = new Task1(3, 5); we cannot access private constrcutor in different class.
			
		
	}

}
