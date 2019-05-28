package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utills.CommonMethods;

public class hoverOver extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hoverOver = driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		Actions action= new Actions(driver);
		action.moveToElement(hoverOver).click().perform();
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		Thread.sleep(2000);
		driver.close();
		
		WebElement hoverOverOther = driver.findElement(By.xpath("//span[text()='VIDEOS']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(hoverOverOther).click().perform();
		driver.findElement(By.xpath("//span[text()='Paid Selenium Video Tutorial']")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}