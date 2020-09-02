package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasis {

	// sequence
	// System setup property
	// Login method
	// Lunch the browser
	// Enter url
	// Google title test
	// Logout from app
	// close browser
	// delete all cookies

	// before suite
	// before test
	// before class
	// before method
	// testcase
	// after method
	// after class
	// after test
	// after suite

	// pre condition annotation --starting with @before
	@BeforeSuite
	public void setup() {
		System.out.println("System setup property");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Lunch the browser");
	}

	@BeforeMethod
	public void enterurl() {
		System.out.println("Enter url");
	}

	@BeforeTest
	public void login() {
		System.out.println("Login method");
	}

	// test case-- staring with Test
	@Test
	public void googletitletest() {
		System.out.println("Google title test");
	}

	// post condition -- staring with after
	@AfterMethod
	public void logout() {
		System.out.println("Logout from app");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("delete all cookies");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("close browser");
	}

	@AfterSuite
	public void generatetestreport() {
		System.out.println("generate test report");
	}

}
