package com.class17;

public class AccessingStaticVariables {
	
	public static void main(String[] args) {
		
		/*if I wannt to access Husky class
		 * and if I want to access instances variable
		 * I must create Object
		*/

		Husky obj = new Husky();
		System.out.println(obj.name);//it will be null coz we did not initiliaze value
		
		System.out.println(Husky.breed);
		Husky.breed = "New breed";//if I wanna change static variable in this class it will only effect this class
		//not the other classes.
		System.out.println(obj.breed);//possible but not preferrable
		
	}
	
}
