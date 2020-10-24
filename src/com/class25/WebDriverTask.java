package com.class25;

interface TakesScreenshot{
	//public static final comes implecitly(automatically)
    String $FILE_EXTENTION=".png";//we can use dollar sign and underscore ($ and _ )
	
	void takesScreen();
	
	
	
	
	/*
	 * NOTE!!!!!!!!!!!!!!!!!!!!!!interface has only unimplemented methods but only
	 * for static and default method we can use implemented ...!!!!!!!!! normally
	 * for default access modifier we can not default coz it comes automatically but
	 * in interface public acces modifier comes automatically therefore we must
	 * write in here. 
	 * 
	 * added from jdk 1.8 //jdk=java develop key and when we use
	 * static and default we dont need add the other classes(dont make implemented)
	 * when u create object u can access it.
	 */
	static void takeSelfie() {
		System.out.println("I am defined static method of TakesScreenshot interface");
	}

	default void takePictures() {
		// in interface for default modifier u must write default coz java add public automatically. 
		System.out.println("I am default defined method of TakesScreenshot interface");
	}
}

interface Application{
	
	void ApplicationTest();
}

public interface WebDriverTask extends TakesScreenshot{//interface to interface ==>extends
	                                                   //class to interface ==> implements
	                                                   //class to class ==> extends
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
	

}

abstract class Browser {
	
	String name;//inside the abstract class we can use instance variable but we can use inside interface.
	public abstract void refresh();
}
class ChromeDriver extends Browser implements WebDriverTask,Application{

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window in Chrome Browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find Element by XPath in Chrome Browser");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh Chrome Browser");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenshot in Chrome Browser");
		
	}

	@Override
	public void ApplicationTest() {
		System.out.println("Application test in Chrome Browser");
		
	}
	
}


class FirefoxDriver extends Browser implements WebDriverTask,Application{

	@Override
	public void openBrowser() {
		System.out.println("Open Firefox Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Firefox Browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window in Firefox Browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find Element by CCS Firefox selector");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh Firefox Browser");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenshot in Firefox Browser");
		
	}

	@Override
	public void ApplicationTest() {
		System.out.println("Application test in Firefox Browser");
		
	}
	
}
