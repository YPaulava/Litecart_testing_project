package com.qa.selenium.training.SeleniumTrainingWithMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestLogin_Firfox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\DRIVERS\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8090/litecart/public_html/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
