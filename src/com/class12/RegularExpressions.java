package com.class12;

public class RegularExpressions {
	
	public static void main(String[] args) {
		
System.out.println("=== 15. variableName.replaceAll(String regex, String replacement); REGULAR EXPRESSION ===)");
		
		/*16. variableName.replaceAll(String regex, String replacement); regex==>regular expression.
		 * 
		 *=============  REGULAR EXPRESSION  =============
		 * 
		 *  It will replace all that matches specified pattern [regex];
		 * 
		 * [A-Z] ==>it will delete all character from A-Z in the string 
		 * [a-z] ==>it will delete all character from a-z in the string 
		 * [A-Za-z] ==>it will delete all character from A-Z and a-z in the string 
		 * [^A-Za-z]==>it keeps only A-Z and a-z character and delete the others.
		 * [^A-Za-z0-9]==>it keeps all character and numbers and delete the other
		 * [0-9] ==>it will delete all numbers from 0-9 in the string 
		 * [^abc] ==>it keeps only a, b, or c in the string and delete the others.
		 * ^ meaning ==>keep dont delete.
		 * it returns to String
		 * 
		 */
		
		//How can I print only Hello World?
		String str1 = "12Hello 3234 World 456%^%%$&%%$";
		String deleteAllCharacter = str1.replaceAll("[^A-Za-z]", "");//replaceAll returns to String
		System.out.println(deleteAllCharacter);
		
		
		//How can I delete numbers?
		String str2 = "12345 Hi *^$%^*#";
		String deleteAllNum = str2.replaceAll("[0-9]", "");
		System.out.println(deleteAllNum);
		
		//How can I print only Hello?
		String str3 = "1Hello23";
		
		//first way
		System.out.println(str3.replaceAll("[0-9]", ""));
		
		//second way
		System.out.println(str3.replaceAll("[^A-Za-z]", ""));
		
		
		
		////How can I print only numbers?
		
		//first way
		System.out.println(str3.replaceAll("[A-Za-z]", ""));
		
		//second way
		System.out.println(str3.replaceAll("[^0-9]", ""));
		
		
	}

}
