package InterviewQuestions;

public class HowManyAlphaCharactersPresentInAString {

	public static void main(String[] args) {
		
		/*
		 * Find out how many alpha characters present in a string?
		 */
		
		String str = "Hello 6876868 *&^^, welcomegyggiugig!!!!";
		
		//first way
		str = str.replaceAll("[^A-Za-z]", "");
		System.out.println(str.length());
		
		//second way
		System.out.println(str.replaceAll("[^A-Za-z]", "").length());
		

	}

}
