package InterviewQuestions;

public class SwapNumbers {

	public static void main(String[] args) {

		/* Write a program to swap 2 numbers without a temporary variable?
		 * Swap 2 strings without a temporary variable?
		 */
		
		int a = 10;
		int b = 20;
		
		         
		a = a+b;//a = 10+20=30
		b = a-b;//b = 30-20=10
		a = a-b;//a = 30-10=20
		
		System.out.println("The value of a= "+a);
		System.out.println("The value of b= "+b);
		
		
		System.out.println("................................");
		
		String str1 = "Hello";
		String str2 = "Welcome";
		
		//first way substring
		str1 = str1 + str2;// str1 = HelloWelcome
		str2 = str1.substring(0,5);//str2 = Hello
		str1 = str1.substring(5);//str1 = Welcome
		
		//second way lenght
		str1 = str1+str2;//str1 = HelloWelcome ==length==>12
		str2 = str1.substring(0, str1.length()-str2.length());//str2 = Hello
		str1 = str1.substring(str2.length());//str1  = Welcome
		
				
		System.out.println("The value of str1 = "+str1);
		System.out.println("The value of str2 = "+str2);
		

	}

}
