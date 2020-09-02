package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium software\\chr1\\chromedriver.exe");
		driver = new ChromeDriver();// lunch browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=2)
	public void googletest(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1)
	public void logotest(){
		boolean displayed = driver.findElement(By.id("logo-default")).isDisplayed();
		System.out.println(displayed);
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
}
