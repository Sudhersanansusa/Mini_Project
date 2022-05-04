package com.Testng;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = 1)
	public void briyani() {
		
		System.out.println("Mutton Briyani");
	
	}
	
	
	@Test(priority = -1)
	public void noodles() {
		
		System.out.println("Chicken Noodles");

	}
	
	@Test(priority = 0)
	public void chicken_65() {

		System.out.println("Chicken 65");

	}
	

}
