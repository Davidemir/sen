package com.class16_____accessModifier;

import com.class16.USA;//we import the USA class

//!!!!!!!!!!!!!!! note : if u want reach all class ==> import com.class16.*;

public class Mexico {
	
	public static void main(String[] args) {
		
		//USA us2 = new USA();//we can not see USA object coz USA class was default.
		//but if u make USA public class, and then u can reach it.
		
		USA us2 = new USA();//dont forget the import
		
		System.out.println(us2.mainState);//we can access coz it is public
		
		
		//System.out.println(us2.school);//can not be visibility coz school is protected
		//System.out.println(us2.name);//can not be visibility coz name is default
		//System.out.println(us2.capitalCity);//can not be visibility coz capitalCity is private
	}

}
