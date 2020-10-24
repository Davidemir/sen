package com.class10;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 * 
		 */
		
		//first way
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		//second way
		
		char[] grade2= {'A', 'B' ,'C', 'D', 'E', 'F'};
		
		System.out.println(grade2[1]);
		
		
		/*
		 *Create an array of names and store all names of your group. 
		 *Then print your name from that array. (use 2 different ways of creating an array). 
		 */
		
		//first way
		String[] names= new String[3];
		names[0]="Efe";
		names[1]="Halo";
		names[2]="David";
		
		System.out.println(names[2]);
		
		//second way
		String[] name= {"Efe", "Halo", "David"};
		System.out.println(name[2]);
		
		
		/* 
		 * Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.  
		 */
		
		//first way
		String[] words= new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="Day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		//second way
		String[] word= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
	}

}
