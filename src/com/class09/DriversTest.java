package com.class09;

import utills.CommonMethods;

public class DriversTest extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome","http://google.com");
		driver.quit();

	}

}
