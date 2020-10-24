package com.class18;

public class StudentTask2 {

	/*
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name. 
	 * NOTE: please use different names for instance and local variables.
	 * 
	 */
	
	String name;
	int grade1, grade2, grade3;
	
	StudentTask2(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
		name = studentName;
		grade1 = studentGrade1;
		grade2 = studentGrade2;
		grade3 = studentGrade3;
		
	}
	
	public void calculateAverage() {
		int average = (grade1 + grade2 + grade3)/3;
		System.out.println("Student "+name+" has an average grade of "+average);
	}
	
	
	public static void main(String[] args) {
		
		StudentTask2 student1 = new StudentTask2("Dave" , 70 , 80 , 85);
		student1.calculateAverage();
		
		
		StudentTask2 student2 = new StudentTask2("Halo" , 80 , 80 , 79);
		student2.calculateAverage();
		
		
		StudentTask2 student3 = new StudentTask2("Kadir" , 76 , 80 , 85);
		student3.calculateAverage();
		
		
		StudentTask2 student4 = new StudentTask2("Said" , 90 , 71 , 97);
		student4.calculateAverage();
		
		
		StudentTask2 student5 = new StudentTask2("Nuri" , 89 , 94 , 85);
		student5.calculateAverage();
		
	}
}
