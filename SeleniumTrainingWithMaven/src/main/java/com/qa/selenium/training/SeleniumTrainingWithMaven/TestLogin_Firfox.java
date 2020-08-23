package com.qa.selenium.training.SeleniumTrainingWithMaven;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestLogin_Firfox {

	public WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\DRIVERS\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8090/litecart/public_html/admin/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//appearence
		driver.findElement(By.cssSelector("#box-apps-menu > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-template > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-logotype > a:nth-child(1) > span:nth-child(1)")).click();
		
		//catalog
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(2) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-catalog > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-product_groups > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-option_groups > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-manufacturers > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-suppliers > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-delivery_statuses > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-sold_out_statuses > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-quantity_units > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-csv > a:nth-child(1) > span:nth-child(1)")).click();
		
		//countries
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(3) > a:nth-child(1) > span:nth-child(2)")).click();
	    //currencies
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)")).click();
     
		//customers
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(5) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-customers > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-csv > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-newsletter > a:nth-child(1) > span:nth-child(1)")).click();
		
	    //geo_zones
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(6) > a:nth-child(1) > span:nth-child(2)")).click();
		
		//languages
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(7) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-languages > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-storage_encoding > a:nth-child(1) > span:nth-child(1)")).click();
		
		//modules
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(8) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-jobs > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-customer > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-shipping > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-payment > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-order_total > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-order_success > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-order_action > a:nth-child(1) > span:nth-child(1)")).click();
		
		//orders
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(9) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-orders > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-order_statuses > a:nth-child(1) > span:nth-child(1)")).click();
		
		//pages
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(10) > a:nth-child(1) > span:nth-child(2)")).click();
		
		//reports
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(11) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-monthly_sales > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-most_sold_products > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-most_shopping_customers > a:nth-child(1) > span:nth-child(1)")).click();
		
		//settings
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(12) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-store_info > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-defaults > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-general > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-listings > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-images > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-checkout > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-advanced > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-security > a:nth-child(1) > span:nth-child(1)")).click();
		
		//slides
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(13) > a:nth-child(1) > span:nth-child(2)")).click();

		
		//tax
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(14) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-tax_classes > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-tax_rates > a:nth-child(1) > span:nth-child(1)")).click();
		
		//translations
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(15) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#doc-search > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-scan > a:nth-child(1) > span:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#doc-csv > a:nth-child(1) > span:nth-child(1)")).click();
		
		//users
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(16) > a:nth-child(1) > span:nth-child(2)")).click();
		
		//vQmods
		driver.findElement(By.cssSelector("ul#box-apps-menu > li:nth-child(17) > a:nth-child(1) > span:nth-child(2)")).click();
		driver.findElement(By.cssSelector("span.name:nth-child(1)")).click();
		
		driver.close();
	}

}
