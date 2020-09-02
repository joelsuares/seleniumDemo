package com.parameter.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paramterTest {

	WebDriver driver;

	@Test
	public void yahoologinTestmethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chr1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");

		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys("joelsuares@yahho.com");
		driver.findElement(By.id("login-signin")).click();
	}

}
