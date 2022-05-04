package com.Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	
	@Test
	public void log_in() {
		
		String A = "Susa6996";
		
		String B = "susa6996";
		
		SoftAssert A1 = new SoftAssert();
		
		A1.assertEquals(B,A);
		
		System.out.println("Hi");

	}

}
