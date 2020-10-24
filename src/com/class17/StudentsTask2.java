package com.class17;

public class StudentsTask2 {
	
	/*2. Create a Class called Students 
	 * ● Create three variables studentName , studentID and numberOfStudents 
	 * ● Create three objects of the Students Class 
	 * ● Set the value for studentName , studentID and 
	 * increment the numberOfStudents for each object 
	 * ● Print out total number of students 
	 */
	
	String studentName;
	int studentID;
	static int numberOfStudents = 0;

	public static void main(String[] args) {
		
		StudentsTask2 task1 = new StudentsTask2();
		StudentsTask2 task2 = new StudentsTask2();
		StudentsTask2 task3 = new StudentsTask2();
		
		task1.studentName = "Dave";
		System.out.println(task1.studentName);
		task1.studentID = 1357;
		System.out.println(task1.studentID );
		System.out.println(numberOfStudents++);
		
		task2.studentName = "David";
		System.out.println(task2.studentName);
		task2.studentID = 57;
		System.out.println(task2.studentID );
		System.out.println(numberOfStudents++);
		
		
		task3.studentName = "Davud";
		System.out.println(task3.studentName);
		task3.studentID = 357;
		System.out.println(task3.studentID );
		System.out.println(numberOfStudents++);
		
		System.out.println("Total number of sutudents are "+numberOfStudents);
		
	}
}
