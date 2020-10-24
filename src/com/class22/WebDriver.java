package com.class22;

public class WebDriver {
	
	public void open() {//overriden
		System.out.println("Openning browser");
	}

	public void refresh() {
		System.out.println("Refreshing browser");
	}
}

class ChromeDriver extends WebDriver{
	
	public void open() {//overriding
		System.out.println("Openning Chrome browser");
	}
	
}


class FirefoxDriver extends WebDriver{
	
	public void open() {//overriding
		System.out.println("Openning Firefox browser");
	}
	
	
	public void getTitle() {
		System.out.println("Getting title on firefox browser");
	}
}
