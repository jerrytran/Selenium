package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssTaskTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.cssSelector("input[name^='firstName']")).sendKeys("Jerry");
		driver.findElement(By.cssSelector("input[name$='lastName']")).sendKeys("Tran");
		driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys("703332089");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Tom.jerrykid3011@gmail.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Sooooochuu123");
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("Thitcho123");
		driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("Thitcho123");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		

	}

}
