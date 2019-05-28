package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("This is the right title");
		}
		else {
			System.out.println("This is not the right title");
		}
	}

}
