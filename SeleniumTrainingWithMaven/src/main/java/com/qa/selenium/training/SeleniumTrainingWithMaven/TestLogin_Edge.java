package com.qa.selenium.training.SeleniumTrainingWithMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogin_Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\DRIVERS\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8090/litecart/public_html/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
