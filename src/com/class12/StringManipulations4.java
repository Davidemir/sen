package com.class12;

public class StringManipulations4 {

	public static void main(String[] args) {
		
		System.out.println("========== 15. variableName.replace(char oldChar, char newChar); ===========)");
		
		/*15. variableName.replace(char oldChar, char newChar);
		 * 
		 *It will replace old character/value  to  new character/value.  
		 * it returns to String
		 */

		String str = "I am good tester!!!";
		String newStr = str.replace("a", "e");//replace returns to String
		//meaning convert all a character to e
		System.out.println(newStr);
		
		System.out.println(str.replace("good", "great"));//meaning convert good to great
		
		String newStr2 = str.replace("tester", "programmer");//meaning convert tester to programmer
		System.out.println(newStr2);
		
		System.out.println(str.replace("Tester", "programmer"));//NOTE IT WILL NOT CONVERT COZ .tester starts lowerCase
		                                                       //but we wrote upperCase.
		
		System.out.println(str.replace("!!!", "?"));//meaning convert ! to ?
		
		
		
	}

}
