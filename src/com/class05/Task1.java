package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
		
        boolean isDisplayed = driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
        if (isDisplayed) {
			System.out.println("Saucedemo logo is displayed");
		} else {
			System.out.println("Saucedemo logo is NOT displayed");
		}
        
        boolean isWordDisplayed = driver.findElement(By.xpath("//div[@class='product_label']")).isDisplayed();
		if(isWordDisplayed) {
			System.out.println("Saucedemo Word is displayed");
		} else {
			System.out.println("Saucedemo Word isn't displayed");
		}
		
		
	}

}
