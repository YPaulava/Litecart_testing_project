package com.qa.selenium.training.SeleniumTrainingWithMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestLogin_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\DRIVERS\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://localhost:8090/litecart/public_html/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
	}

}
