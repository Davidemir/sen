package InterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		/*Fibonacci Series=is the sum of the two preceding numbers
		 * 
		 *0+1=1,   1+1=2,  2+1=3, 3+2=5, 5+3=8, 8+5=13, 13+8=21
		 * 0 + 1 = 1   2   3   5   8   13  21
		 * a + b = c
		 *     a + b = c
		 *         a + b = c
		 *             a + b = c
		 *                 a + b = c
		 *                     a + b = c
		 *                         a + b = c
		 *                 
		 *                 	 
		 */
		
		
		/* Write a Java Program to print first 10 numbers of Fibonacci series */
		
		int a, b,c;
		a=0;
		b=1;
		
		for (int i=0; i<10; i++) {
			System.out.print(a+"   ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
