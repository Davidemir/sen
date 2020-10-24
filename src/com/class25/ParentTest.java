package com.class25;

public class ParentTest {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.hello();//it call only parent class coz we used static method for both class
		          //we call ==> method hidding!!!!!!!!!!!!!!!!!!!!!
	}

}
