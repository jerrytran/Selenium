package com.class07;

import utills.CommonMethods;

public class test extends CommonMethods {

	public static void main(String[] args) {
		CommonMethods.setUpDriver("firefox", "https://google.com");
		driver.close();

	}

}
