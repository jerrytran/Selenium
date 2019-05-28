package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceDemoRadio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		List<WebElement>exp=driver.findElements(By.name("exp"));
		for(WebElement check:exp) 
		{
			Thread.sleep(3000);
			
			if(check.isEnabled()) {
				check.click();
			}
		}
		 List<WebElement>all=driver.findElements(By.xpath("//input[@type='radio']"));
		 for(WebElement check: all) {
			 Thread.sleep(3000);
			 if(check.isEnabled()) {
					check.click();
				}
		 }
		

	}

}
