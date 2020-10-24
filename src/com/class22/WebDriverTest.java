package com.class22;

public class WebDriverTest {

	public static void main(String[] args) {

		System.out.println(" =============== Creating objects of each class ================");
		
		
		WebDriver web = new WebDriver();
		web.open();
		web.refresh();
		

		System.out.println();
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.open();// from child class coz this method is the same with parent class method
		// and it is overridding == > Run Time Polymorphism
		chrome.refresh();// from parent class coz this method is not the same with child class
		// therefore it is not overridding

		System.out.println();

		FirefoxDriver firefox = new FirefoxDriver();
		firefox.open();// from child class coz this method is the same with parent class method
		// and it is overridding == > Run Time Polymorphism
		firefox.refresh();// from parent class coz this method is not the same with child class
		// therefore it is not overridding

		System.out.println();
		
		
		
		
		
		
System.out.println(" FIRST WAY : Creating an object of the child class and giving referance to the Parent class===== ");

		// creating an object of the child class and giving referance to the Parent class
		WebDriver driver = new ChromeDriver();
		driver.open();// from child class coz this method is the same with parent class method
		// and it is overridding == > Run Time Polymorphism
		driver.refresh();// from parent class coz this method is not the same with child class
		// therefore it is not overridding

		
		// creating an object of the child class and giving referance to the Parent class
		WebDriver driver2 = new FirefoxDriver();
		driver2.open();// from child class coz this method is the same with parent class method
		// and it is overridding == > Run Time Polymorphism
		driver2.refresh();// from parent class coz this method is not the same with child class
		// therefore it is not overridding

		// driver2.getTitle();
		// no access to child specific class though Parent type.

		
		
		// NOTE: DURING THE RUN TIME COMPILE ONLY AVAIBLE REFERANCE TYPE.(PARENT CLASS)
		// compile first will be check parent class if child class has the method
		// compile will call child class otherwise will call parent class method.
		
		
		System.out.println();
		

		System.out.println("===================== SECOND WAY : array it has 2 diffrent way :================== ");
		
System.out.println("1. we created objects and assigned to the variables and then stored those variables inside the array");

		WebDriver[] driverArray = { driver, driver2 };

		// I wanna reach driver by one by ==> we need a loop

		// with advanced loop
		for (WebDriver myDriver : driverArray) {
			myDriver.open();
			myDriver.refresh();

		}
		System.out.println(".....................");

		// with for loop
		for (int y = 0; y < driverArray.length; y++) {
			driverArray[y].open();
			driverArray[y].refresh();
		}

		
		System.out.println();
		
		System.out.println("...... 2. creating an object and storing it directly into an Array of Cards	.......");
		
		
		WebDriver[] driverArray2 = { new ChromeDriver(), new FirefoxDriver() };

		// I wanna reach driver by one by ==> we need a loop

		// with advanced loop
		for (WebDriver myDriver2 : driverArray2) {
			myDriver2.open();
			myDriver2.refresh();
		}
		
		System.out.println(".....................");
			// with for loop
		for (int y = 0; y < driverArray2.length; y++) {
			driverArray2[y].open();
			driverArray2[y].refresh();
			}

		}

	}

