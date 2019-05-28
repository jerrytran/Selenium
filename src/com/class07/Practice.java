package com.class07;

import org.openqa.selenium.By;

import utills.CommonMethods;

public class Practice extends CommonMethods {

	public static void main(String[] args) {


		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("iframe1");
		driver.findElement(By.cssSelector(""));

	}

}
