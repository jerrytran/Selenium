package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("google")) {
			System.out.println("This is the right title");
		}
		else {
			System.out.println("Sorry this not the title");
		}
		
		
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		String title1 =driver.getTitle();
		if(title1.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("This is the right title");
		}
		else {
			System.out.println("This is not the right title");
		}

	}

}
