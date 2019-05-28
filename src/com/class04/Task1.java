package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("tom.jerrykid3011@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Thit123456789!");
	    driver.findElement(By.xpath("//input[contains(@data-testid,'log')]")).click();
		
		
	}

}
