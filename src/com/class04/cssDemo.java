package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn_action")).click();

	}

}
