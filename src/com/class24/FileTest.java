package com.class24;

public class FileTest {

	public static void main(String[] args) {
		
		File obj1 = new JavaFile();
		obj1.edit();
		obj1.close();
		obj1.open();

		File obj2 = new WordFile();
		obj2.edit();
		obj2.close();
		obj2.open();

		
		File obj3 = new PDFFile();
		obj3.edit();
		obj3.close();
		obj3.open();

	}

}
