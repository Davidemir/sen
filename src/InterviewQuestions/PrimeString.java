package InterviewQuestions;

public class PrimeString {

	public static void main(String[] args) {
		
		/* Write a java program to check whether a given number is prime or not? 
		 * ==>Prime: is a number that has to meet 2 conditions: it should be be divisible by 1 and
		 * by itself ONLY
		 * FOR EXAMPLE ==> 2, 3, 5, 7, 11, 13, 17, 19, 23 ...
		 */
		

		// take range of numbers from 2 to 100 and print all prime
		
		//when we write one number we must start to division first number to till that number.
		// for example ==> 2, 3 (2,3), 4(2,3,4), 5(2,3,4,5), 6(2,3,4,5,6)

		int num = 5;
		boolean isPrime = true;

		//we use to if condition coz 0 normally is not Prime number but in system it shows prime number
		//therefore we used to if condition for fixed the issue.
		
		if (num <=1) { // or if(num == 0 || num ==1){ //both of is right
			isPrime = false;
		} else {
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if (isPrime) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is NOT Prime number");
		}
	}
}

