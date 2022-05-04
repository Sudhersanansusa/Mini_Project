package com.Testng;

import org.testng.annotations.Test;

public class Expected_exception {

	@Test(expectedExceptions = ArithmeticException.class)
	public void exception() {
		
		int A = 50;
		
		int B = 100;
		
		System.out.println(A/B/0);
	
	}
}
