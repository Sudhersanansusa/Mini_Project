package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assert {
	
	@Test
	public void log_in() {
		
		String A = "Susa6996";
		
		String B = "susa6996";
		
		Assert.assertNotEquals(B, A);
		
		System.out.println("Hi");
		
		Assert.assertEquals(B,A);
			
		System.out.println("Hello");
				

	}

}
