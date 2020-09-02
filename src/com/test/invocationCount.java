package com.test;

import org.testng.annotations.Test;

public class invocationCount {

	@Test(invocationCount=3)
	public void sum(){
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("sum is "+ c);
	}
}
