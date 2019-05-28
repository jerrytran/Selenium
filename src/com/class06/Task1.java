package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\Jerry\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		WebElement dropD = driver.findElement(By.cssSelector("select[aria-describedby='searchDropdownDescription']"));
		
		Select select = new Select(dropD);
		List<WebElement> allOptions=select.getOptions();
		Iterator<WebElement> all = allOptions.iterator();
		while(all.hasNext()) {
			String allText = all.next().getText();
			System.out.println(allText);
		}
		
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
