package com.class19;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		
		System.out.println("I am non argument constructor");
	}
	
	
	ThisWithConstructor(String str){
		this();
		/* used to call current class contructor
		 * this(); it will call ThisWithConstructor() and compile execute 2 constrcutors
		 */
		
		System.out.println("I am  constructor with 1 String parameter");
	}
	
	ThisWithConstructor(String str, String str1){
		this(str); //==> it always MUST be first statement.
		// OR this("hello"); ==> both of the same.  
		
		//this();==> in this case it is second statement therefore compiler give an error.
		
		/* it will call ThisWithConstructor(String str) and
		 * inside ThisWithConstructor(String str) we used this(); therefore it will call
		 * ThisWithConstructor() and compile execute 3 constrcutors
		 */
		
		System.out.println("I am  constructor with 2 String parameter");
	}
	
	
	public static void main(String[] args) {
		
		ThisWithConstructor obj = new ThisWithConstructor("hello");
		/* Can we execute 2 constructor when we creating an Object
		 * yes. It can be achieved using this();
		 * this type of constructor calls is known as CONSTRUCTOR CHAINING (zincirleme)
		 */
		 
		System.out.println("............................................");
		
		ThisWithConstructor obj1 = new ThisWithConstructor("hello", "bye");
		
	}

}
