package com.class28;

import java.util.*;

class Student {

	String name;
    int studentID;
    
    public Student(String name,int studentID ) {
    	this.name = name;
    	this.studentID = studentID;
    }
    
    public void display(){
    	System.out.println("Student name is "+name+" and hisid is "+studentID);
    }
	
	/*
	 * Create a Set collection that will hold Objects of Student Type. 
	 * In this set we do not care about the insertion order. Each student object should have
	 * name and studentID. Display name of each student.
	 */

    /*
     * NOTE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * if u see the Object type question:
     * first create instance variable 
     * second create Constructor and initilaze instance variable to local variable
     * third when u create Collection and then create to add method;
     * it must like below type
     * for example obj.add(new Student("Sakar", 10));
     */
    
    
public static void main(String[] args) {
		
		Set<Student> obj = new HashSet<>();
		obj.add(new Student("Sakar", 10));
		obj.add(new Student("Erdal", 9));
		obj.add(new Student("Orhan", 11));
		obj.add(new Student("Semih", 4));
		
		for(Student st : obj) {
			st.display();
		}
			
	}
 }


