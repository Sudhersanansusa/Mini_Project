package com.Testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test@Ignore
	public void briyani() {
		
		System.out.println("Mutton Briyani");
	
	}
	
	
	@Test(dependsOnMethods = "chicken_65")
	public void noodles() {
		
		System.out.println("Chicken Noodles");

	}
	
	@Test
	public void chicken_65() {

		System.out.println("Chicken 65");

	}
	

}
