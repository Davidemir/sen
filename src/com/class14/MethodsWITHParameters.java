package com.class14;

public class MethodsWITHParameters {

	void sayHello(String name) {//sayHello(String name) if parantesis is NOT empty ==>it is parameter.
		                        // ==> parameter is the value that we can pass to our method.

		//System.out.println("Hello Dave"); 
		System.out.println("Hello "+name); 
		
		/*Dave is the name and it is String value and instead of Dave 
		 * we can write String name inside the method ==>sayHello(String name)
		 * and it will be parameter and this way easier than without parameter
		 * coz if want to change name we will not write name everytime.
		 * we will write ("Hello "+name) inside the sout and in object we will write :
		 * 
		obj.sayHello("Dave");
		obj.sayHello("Haloo");
		obj.sayHello("Efe");
		obj.sayHello("Adam");
		
		 * it will come output
		 */
		

	}

	public static void main(String[] args) {

		MethodsWITHParameters obj = new MethodsWITHParameters();
		obj.sayHello("Dave");
		obj.sayHello("Haloo");
		obj.sayHello("Efe");
		obj.sayHello("Adam");
		/*if we wanna call switch case output we must write here.We dont need create
		*another Object again.It is super easy .when u click obj. all section will come
		*select sayHelloDifferentLanguage();
		*obj.sayHelloDifferentLanguage();//compiler give an error we must write country name inside
		*select sayHelloDifferentLanguage("Turkey");
		*/
		obj.sayHelloDifferentLanguage("Turkey");
		obj.sayHelloDifferentLanguage("Kurdistan");
		obj.sayHelloDifferentLanguage("Iraq");
		obj.sayHelloDifferentLanguage("Italy");
		obj.sayHelloDifferentLanguage("Spain");
		//obj.sayHelloDifferentLanguage(1234);//compiler give an error coz it need country name
		//but we wrote int value.
		
		obj.sayNameAndAge("David", 32);
		obj.isSnowing(true);
	}
	
	

	/*create a method that will say hello in diffrent language based on the value
	 * will be paased when user calls a method. 
	 */
	
	void sayHelloDifferentLanguage(String country) {

		
		//String country = "Turkey"; instead of this we can write 
		//String country inside sayHelloDifferentLanguage(String country) 
		String output;
		switch (country) {
		
		case "USA":
			output = "Hello";
			break;
		case "Turkey":
			output = "Merhaba";
			break;
		case "Kurdistan":
			output = "Slaw";
			break;
		case "Iraq":
			output = "Merhaban";
			break;
		case "Canada":
			output = "Hello";
			break;
		case "Italy":
			output = "Ciao";
			break;
	    default:
	    	output = "Unknown";
		     
		}
		System.out.println(output);
	}
	
	void sayNameAndAge(String name,int age) {
		
		//System.out.println("My name is John and I am 25 years old");
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	
	//create a method that will check if it snowing
	// if snow==> stay at home, otherwise==>go for a walk
	
	//isSnowing==>method name     //boolean isSnowing==> parameter
	void isSnowing(boolean isSnowing) {//==>method header
		//method body { }everything inside the bloks 
		
		//boolean isSnowing = false; instead of these we can write 
		//void isSnowing(boolean isSnowing)
		
		if(isSnowing) {
			System.out.println("Stay at home");
		}else {
			System.out.println("Go for a walk");
		}
	}
}
