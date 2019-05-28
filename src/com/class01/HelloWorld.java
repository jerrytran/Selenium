package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		driver.get("https://facebook.com");
		
		System.setProperty("webdriver.gecko.driver", "c:\\Users\\Jerry\\Selenium\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://google.com");

	}

}
