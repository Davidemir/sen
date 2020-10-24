package com.class25;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
		//NOTE !!!!!!!!!!!!compile always looks reference type.
		//compile give u access only methods which in avaible in reference type.
		
		
		//child class can achieve all class
		ChromeDriver ch = new ChromeDriver();//new FirefoxDriver (); is the same
		ch.openBrowser();
		ch.closeBrowser();
		ch.maximizeWindow();
		ch.findElement();
		ch.refresh();
		ch.takesScreen();
		ch.ApplicationTest();
		TakesScreenshot.takeSelfie();
		ch.takePictures();
		
		
		
		
		WebDriverTask driver = new ChromeDriver();
		driver.openBrowser();
		driver.closeBrowser();
		driver.maximizeWindow();
		driver.findElement();
//		driver.refresh(); //parent class can not achieve child class
		driver.takesScreen();
//		driver.ApplicationTest(); ce coz it has not any relationship each them coz we did not use extends or implements
		//WebDriverTask between Application
		TakesScreenshot.takeSelfie();
		driver.takePictures();
		
		
		
		System.out.println("............................");
		
		//Grandparent class can achieve own class
		TakesScreenshot ts = new ChromeDriver();
//		ts.openBrowser();
//		ts.closeBrowser();
//		ts.maximizeWindow();
//		ts.findElement();
//		ts.refresh();
		ts.takesScreen();
		ts.takePictures();
		TakesScreenshot.takeSelfie();
		
	}

}
