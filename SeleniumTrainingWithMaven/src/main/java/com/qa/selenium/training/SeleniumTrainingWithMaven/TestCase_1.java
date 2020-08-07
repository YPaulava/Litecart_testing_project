package com.qa.selenium.training.SeleniumTrainingWithMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.close();
		
	}

}
