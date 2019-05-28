package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("tom.jerrykid3011@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Thit123456789!");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_2")).click();
	

	}

}
