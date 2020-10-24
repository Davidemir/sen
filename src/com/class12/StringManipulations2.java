package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		System.out.println("========== 6. variableName.contains(String anotherString ); ===========)");
		
		/*6. variableName.contains(String anotherString );
		 * 
		 * This method  checks for specific value in the string.
		 * If value is present ==>true , else ==>false.
		 * it returns boolean
		 */
		
		String str = "Good morning, students";
		boolean contains= str.contains("morning");//contain returns boolean
		System.out.println(contains);
		
		boolean contains1 = str.toLowerCase().contains("morning");
		System.out.println(contains);
		
		System.out.println(str.toUpperCase().contains("morning"));
		
		System.out.println("========== 7. variableName.startsWith(String prefix); ===========)");
		
		/*7. variableName.startsWith(String prefix);
		  
		 * This method tests if a string starts with the specified prefix beginning ==>true , else ==>false
		 * it returns boolean
		 */
		
		String st = "syntax";
		boolean starts = st.startsWith("s");//startsWith returns boolean
		System.out.println(starts);
		
		
		System.out.println("========== 8. variableName.endsWith(String suffix); ===========)");
		
		/*8. variableName.endsWith(String suffix);
		 * 
		 * This method tests if this string ends with the specified suffix ==>true , else ==>false
		 * it returns boolean
		 */
		
		String sT = "David";
		boolean ends = sT.endsWith("d");//endsWith returns boolean
		System.out.println(ends);
		
		System.out.println(sT.endsWith("i"));
		
		
		System.out.println("========== 9. variableName.isEmpty( ); ===========)");
		
		/*9. variableName.isEmpty( );
		 * 
		 * This method checks whether a String is empty or not. 
		 * if length of a string is = 0==> string is empty(TRUE), else==> it is not empty(FALSE).
		 * it returns boolean 
		 */
		
		String ss = "";
		boolean empty = ss.isEmpty();//isEmpty returns boolean
		System.out.println(empty);
		
		String ss1 = " "; //space is calculated therefore it is not empty
		System.out.println(ss1.isEmpty());
		
		String ss2 = " a ";
		System.out.println(ss2.isEmpty());
		
		System.out.println("========== 9. variableName.concat(String str); ===========)");
		
		/*9. variableName.concat(String str);
		 * 
		 * It will concatinate 1 string to the end of another
		 */
		
		//first way
		String a = "Hello ";
		String b = "Ali!";
		
		//both of like the same
		System.out.println(a+b);
		System.out.println(a.concat(b));
		
		
		//second way
		String c = "Today is ";
		c = c.concat("sunny");
		System.out.println(c);
		
		
		System.out.println("========== 10. variableName.trim; ===========)");
		
		/*10. variableName.trim; (duzeltmek)
		 * 
		 * it only care spaces!!!!!
		 * It will remove spaces at the beginning and at the end of your String
		 * 
		 */
		
		String expected = "You may go to doctor";
		String actual = "         You may go to doctor                   ";
		
		//System.out.println(expected.equals(actual));//it will be false but if u use trim u can convert to true.
		actual = actual.trim();
		System.out.println(expected.equals(actual));//it will be true coz we used trim
		
	}

}
