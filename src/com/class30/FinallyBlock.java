package com.class30;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str="Hello";
		
		try {
			//char charter = str.charAt(0);
			char character=str.charAt(20);//new StringIndexOutOfBoundsException();
			System.out.println(character);
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("I am a finally block");
		}
		
		System.out.println("End of the code");
	}
}