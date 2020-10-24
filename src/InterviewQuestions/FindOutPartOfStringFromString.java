package InterviewQuestions;

public class FindOutPartOfStringFromString {

	
	public static void main(String[] args) {
		
		/*
		 * How to find out the part of the string from a String?
		 * What is substring?
		 * Find number of words in string?
		 */

		String str="Today is very cold outside";
		String subString=str.substring(0, 5);
		System.out.println(subString);
		/*Step1: split based on the space --> array of String
		 *Step2: find the length of an array
		 */
		System.out.println(str);
		String[] words=str.split(" ");
		System.out.println(words.length);
	}
}
