package com.test;

import org.testng.annotations.Test;

public class exceptionTimeout {

//	@Test(invocationTimeOut=2000)
//	public void infinitloop(){
//		int i=1;
//		while(i==1){
//			System.out.println(i);
//		}
//	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test(){
		String x="100A";
		Integer.parseInt(x);
	}
	
}
