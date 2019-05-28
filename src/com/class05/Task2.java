package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public static String userName="standard_user";
	public static String passWord="secret_sauce";		

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys(passWord);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        WebElement productTxt= driver.findElement(By.xpath("//div[@class='product_label']"));

        String valueProduct = productTxt.getText();
        if(valueProduct.equals("Products")) {
        	System.out.println(userName+ " is log in");
        } else {
        	System.out.println(userName+ " is fail log in");
        }
	}

}
