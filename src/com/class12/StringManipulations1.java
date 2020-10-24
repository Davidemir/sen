package com.class12;

public class StringManipulations1 {

	public static void main(String[] args) {
		
		System.out.println("=========   1.variableName.length();   ==========");
		/*1.variableName.length();
		 * 
		 * This method or function returns numbers of character in the String 
		 * Everything inside the String it will calculated
		 * space, comma (,) exclamation mark(!)...
		 * length returns to int
		 */
		
		String str = "Syntax";
		//===first way==
		int lengthOfString = str.length();//length returns to int
		System.out.println(lengthOfString);
		
        String s = "Syntax Technologies";// NOTE :space calculated
        
        int lengthOf2String = s.length();
        System.out.println(lengthOf2String);
        
        String s2 = "Welcome, students!";// NOTE :space , comma (,) ,exclamation mark(!) will calculated 
      //===second way==
        System.out.println(s2.length());
        
        
        
        System.out.println("=========   2.variableName.toUpperCase( );   ==========");
        
        /*2.variable.upperCase();
         * 
         * This method converts all of the characters  to UpperCase
         * upperCase returns to String
         */
        String s3 = "Hello";
        //first way;
        System.out.println(s3.toUpperCase());
        
        String str1 = "my name is david";
        //second way;
        String upperCase = str1.toUpperCase();//upperCase returns to String
        System.out.println(upperCase);
        
        
        System.out.println("=========   3.variableName.toLowerCase( );   ==========");
        
        /*3.variableName.toLowerCase( );
         * 
         * This method converts all of the characters  to LowerCase
         * lowerCase returns to String 
         */
        
        String str4 = "HELLO";
        //first way
        System.out.println(str4.toLowerCase());
        
        //second way
        String lowerCase=str4.toLowerCase();//lowerCase returns to String
        System.out.println(lowerCase);
        
        System.out.println("=========   4.variableName.equals(Object an object );   ==========");
        
        /* 4.variableName.equals(Object an object );
         
         * This method compares two String. 
         * if strings are equal result ==>true , else ==>false.
         * it returns boolean.
         */
        
        
        String st = "Hello";
        String st1 = "hello";
        //first way
       boolean equality = st.equals(st1);// equals return the boolean
       System.out.println(equality );
       
       //second way
       System.out.println(st.equals(st1));
       
       
       System.out.println("=========   5.variableName.equalsIgnoreCase(String anotherString);   ==========");
       
       /*5.variableName.equalsIgnoreCase(String anotherString); 
        * 
        * This method compares two String.
        * Strings are equal or not result ==>true , coz it ignore case.
        * it returns boolean. 
        */
       
       String expectedBrowser = "Chrome";
       String actualBrowser = "chrome";
       
       boolean equals =expectedBrowser.equalsIgnoreCase(actualBrowser);
       System.out.println(equals);
       
       System.out.println(expectedBrowser.equalsIgnoreCase(actualBrowser));
       
	}

}
