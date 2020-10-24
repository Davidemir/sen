package com.class24;

public abstract class File {
	
	/*
	 * Create a class File that will have the following behaviors: open, edit,
	 * close. Edit and close are implemented method while open is an abstract.
	 * Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific
	 * implementation of open behaviour: Example: to open .java file we need
	 * notepad++ or sublime text, to open .doc file we need Microsoft word to be
	 * installed etc
	 */
	
	public void edit(){
		System.out.println("File can be edit");
	}

	public void close() {
		System.out.println("File can be close");
	}
	
	public abstract void open();
}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("JavaFile can be open with ipad");
		
	}
	
}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("WordFile can be open with Microsoft Word");
		
	}
	
}

class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("PDFFile can be open with Adope application");
		
	}
	
}