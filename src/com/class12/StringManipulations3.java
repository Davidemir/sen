package com.class12;

public class StringManipulations3 {

	public static void main(String[] args) {
	
		System.out.println("========== 11. variableName.charAt(int index): ===========)");
		
		/*11. variableName.charAt(int index):
		 * 
		 * returns a character at specified index
		 * it returns char
		 */
		      //index 01234567
		String str = "Students";
		
		System.out.println("....I wanna print e character....");
		char character = str.charAt(4);// charAt(int index) returns char
        System.out.println(character);//e
        
        
        System.out.println("..I wanna print all character by one by with for loop");
        for (int i=0; i<str.length(); i++) {
        	System.out.print(str.charAt(i)+",");
        }
        System.out.println();
       
        System.out.println("....I wanna print u character....");
        System.out.println(str.charAt(2));
        
        System.out.println("========== 12. variableName.indexOf( ); ===========)");
        
        /*12. variableName.indexOf( );
         * 
         * It returns an indexs of specified characters
         * it returns int
         */
        
             //index==>012345
        String str2 = "Monday";
        
        int index = str2.indexOf("n");//indexOf returns int
        System.out.println(index);
        
        
        String str3 = "Syntax Technologies";
        
        System.out.println(str3.indexOf("Syntax"));//if u take first word or sentences index will be 0 coz index start 0
        System.out.println(str3.indexOf("Technologies"));//index 7
        System.out.println(str3.indexOf(" "));//index space 6
        System.out.println(str3.indexOf("w"));//if u dont find anything index will be -1
        System.out.println(str3.indexOf("lo"));//index 13
        
        
        System.out.println("========== 13. variableName.substring(int beginIndex); ===========)");
        
        /*13. variableName.substring(int beginIndex);
         * 
         * It gives another string from your current String.
         * it returns String
         */
        
        String str4 = "Today is Sunday Java class";
        
        String newString = str4.substring(5);
        System.out.println(newString);
     
        System.out.println(str4.substring(15));
        System.out.println(str4.substring(20));
        
        
        System.out.println("========== 14. variableName.substring(int beginIndex, int endIndex); ===========)");
        
        /*14. variableName.substring(int beginIndex, int endIndex);
         * 
         * This method returns a new string that is a substring 
         * that begins with the character at the specified 
         * index and extends to the end of this string 
         * 
         * it returns String
         * 
         */
        
        String str5 = "Today is Sunday Java class";
        
        System.out.println(str5.substring(0, 5));//meaning it will start index 0 and finish index 5  ==>Today
        System.out.println(str5.substring(9, 20));//Sunday Java
        System.out.println(str5.substring(16, 20));//Java
        System.out.println(str5.substring(21));//class
	}

}
