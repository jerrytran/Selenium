package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Tom");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("Jerry");
		driver.findElement(By.name("phone")).sendKeys("7033382089");
		driver.findElement(By.name("userName")).sendKeys("Tom.jerrykid3011@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("hahah this is not my house");
		driver.findElement(By.name("city")).sendKeys("go go go");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.id("email")).sendKeys("Tom.jerrykid3011");
		driver.findElement(By.name("password")).sendKeys("Thit123456789!");
		driver.findElement(By.name("confirmPassword")).sendKeys("Thit123456789");

	}

}
