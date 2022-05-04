package com.Testng;

import org.testng.annotations.Test;

public class Ignore {
	
	@Test
	public void briyani() {
		
		System.out.println("Mutton Briyani");
	
	}
	
	@org.testng.annotations.Ignore
	@Test
	public void noodles() {
		
		System.out.println("Chicken Noodles");

	}
	
	@Test
	public void chicken_65() {

		System.out.println("Chicken 65");

	}
	

}
