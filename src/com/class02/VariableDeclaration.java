package com.class02;

public class VariableDeclaration {
	
	public static void main(String[] args) {
		
		//1.DECLARE AND ASSINGING/ INITILIAZE=
		
		int num=123;
		int num1=6767;
		//int num 1=6767-->compile give an error coz after num can not be space it must be together(num1)
		int num2=786876;
		
		//int num2=1234;-->compile give an error coz after name MUST BE DIFFERENT.We used num2 therefore we can not
		//write again in the same method.
		
		//char num2='a';-->if u change datatypes compile still give an error coz after name MUST BE DIFFERENT.
		//We used num2 therefore we can not .we write again in the same method. 
		long num3=456789098765456789l;
		char num4='A';
		
		//value can be the same. int num=12, int num1=12;
		
		
		
		
		//2.FIRST DECLARE VARIABLE SECOND ASSIGN/INITILIAZE VALUE=
		//first we declare variable
		int n1;
		int n2;
		int n3;
		
		//second we assign/initilaze value
		n1=56;
		n2=27676;
		n3=767;
		
		
		
		//3.FIRST DECLARE ALL VARIABLE TOGETHER AND THEN(SECOND) ASSIGN/INITILAZE VALUE
		
		//first we declare all variable
		int number1,number2,number3;
		
		//second we assign/initilaze value
		number1=12;
		number2=15;
		
		number2=number1;
		System.out.println(number2);//result will be 12 coz. java works the top to bottom.
		
		number3=676;
		//System.out.println(number3);//if we write two System.out.println(number3); result we will be 676
		//and 1000 it will be two result.but if delete System.out.println(number3); and result will be only 1000
		//coz java works to top to bottom.
		number3=1000;
		
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);
		
		//System.out.println(myVariable);//if u dont declare sth, compile give an error.
		System.out.println("myVariable");//BUT if u use the double quates(" ").it will be works.
		
		//char myVariable;
		//System.out.println(myVariable);// if u declare sth but if u dont assign/initilaze it , compile give an error.
		
		
		char myVariable;
		myVariable='*';
		System.out.println(myVariable);
		
		//number2=false;-->compile time will give an error.asking to change datatype of variable number to BOOLEAN.
	}

}
