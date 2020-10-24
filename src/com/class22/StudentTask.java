package com.class22;

public class StudentTask {
	
public static void main(String[] args) {
		//u can access all modifiers in the same class
		StudentTask task = new StudentTask();
		task.study();
		task.doHomework(); 
		task.research();
		task.attendClasses();
	
}
	public void study() {
		System.out.println("Student needs to study");
	}
	
	
	private void doHomework() {
		System.out.println("Students needs to do homework");
	}
	
	
	protected void research() {
		System.out.println("Students needs to do research");
	}

	
	void attendClasses() {
		System.out.println("Student needs to do attend classes");
	}
}

class SyntaxStudent extends StudentTask{
//	@Override  note: u can achieve private class coz it is in the same class but u can not override it.
	
//	private void doHomework() {
//		System.out.println("Syntax Students needs to do all homework");
//	}
	
	
	//child class having it is own method.
	public void doHomework() {
		System.out.println("Syntax Students needs to do all homework");
	}
	
	
	//when overridding we can not reduce a visibility of a method but CAN BE INCREASE
	// public > protected > default > private
	
//	void student() { we can not decrease of visibility. coz default is smaller than public
//		
//	}
	
	@Override
	public void study() {
		System.out.println("Syntax Students need to study");
	}
	
	
	@Override
	public void research() {// it was protected but we increased of visibility.coz Public is higher than protected.
		System.out.println("Syntax Students need to do a lot of research");
	}
	
	@Override
	void attendClasses() {// it was default but we increased of visibility.coz Protectedc is higher than default.
		System.out.println("Syntax Student needs to do attend  All classes");
	}
}