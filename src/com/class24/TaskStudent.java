package com.class24;
/*
 * We have to calculate the percentage of marks obtained in three subjects (each
 * out of 100) by student A and in four subjects (each out of 100) by student B.
 * Create class 'Marks' with an abstract method 'getPercentage'. It is inherited
 * by classes 'A' and 'B' each having a method with the same name which returns
 * the percentage of the students. The constructor of student A takes the marks
 * in three subjects as its parameters and the marks in four subjects as its
 * parameters for student B. Test your code
 */
abstract class Marks{
	
	public abstract double getPercentage();
}

class StudentA extends Marks{

	double math;
	double biology;
	double english;
	
	StudentA(double math, double biology, double english ){
		this.math = math;
		this.biology = biology;
		this.english = english;
	}
	@Override
	public double getPercentage() {
		double average = (math+biology+english)/3;
		return average;
	}
	
}

class StudentB extends Marks{

	double turkish;
	double music;
	double computer;
	double sport;
	
	StudentB(double turkish, double music, double computer, double sport){
		this.turkish = turkish;
		this.music = music;
		this.computer = computer;
		this.sport = sport;
	}
	@Override
	public double getPercentage() {
		double average = (turkish+music+computer+sport)/4;
		return average;
	}
	
}
public class TaskStudent {

	public static void main(String[] args) {
		
		Marks m1 = new StudentA(75, 83, 92);
		double average = m1.getPercentage();
		System.out.println(average);
		
		
		Marks m2 = new StudentB(75, 83, 92, 85);
	    average = m2.getPercentage();//or double ave = m2.getPercentage();
		System.out.println(average);//System.out.println(ave);
		
		
		
		
	}
}
