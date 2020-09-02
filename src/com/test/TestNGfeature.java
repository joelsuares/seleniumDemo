package com.test;

import org.testng.annotations.Test;

public class TestNGfeature {

	@Test
	public void loginTest() {
		System.out.println("login test");
		int i=9/1;
	}

	@Test(dependsOnMethods = "loginTest")
	public void HomepageTest() {
		System.out.println("Home page  test");
	}

	@Test(dependsOnMethods="loginTest")
	public void SearchpageTest() {
        System.out.println("Search Page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regpage(){
		 System.out.println("reg Page test");
	}
}
