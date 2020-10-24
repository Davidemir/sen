package com.class22;

public class StudentTaskTest {
	
	public static void main(String[] args) {
		
		StudentTask task = new StudentTask();
		task.study();
//	    task.doHomework(); compile error (ce) not visible since method inside child is private.
		task.research();
		task.attendClasses();
		
		
		System.out.println(".........................");
		
		StudentTask stu = new SyntaxStudent();
		stu.study();
		stu.research();
		stu.attendClasses();
//		stu.doHomework(); compile error (ce) not visible since method inside parent is private.
		
		
	}

}
