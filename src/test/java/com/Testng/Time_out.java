package com.Testng;

import org.testng.annotations.Test;

public class Time_out {



	@Test(timeOut = 3000)
	public void briyani() throws Throwable {
		
		Thread.sleep(2000);
		
		System.out.println("Mutton Briyani");
	
	}
	
	
	@Test(timeOut = 1000)
	public void noodles() throws Throwable {
		
		Thread.sleep(2000);
		
		System.out.println("Chicken Noodles");

	}
	
	@Test(timeOut = 3000)
	public void chicken_65() throws Throwable {

		Thread.sleep(2000);
		
		System.out.println("Chicken 65");

	}

}
