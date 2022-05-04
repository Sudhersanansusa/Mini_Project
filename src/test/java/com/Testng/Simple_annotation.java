package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotation {
	
	@BeforeSuite
	public void propertyset() {

		System.out.println("Property set");

	}
	
	@BeforeTest
	public void browser_launch() {
		
		System.out.println("Browser launch");
		
	}
	
	@BeforeClass
	public void url_launch() {
		
		System.out.println("Url launch");

	}
	
	@BeforeMethod
	public void sign_in() {
		
		System.out.println("Sign in");

	}
	
	@Test
	public void Kids() {
		
		System.out.println("Kids");

	}
	
	@Test
	public void women() {

		System.out.println("Women");

	}
	
	@Test
	public void Men() {
		
		System.out.println("Men");

	}
	
	@AfterMethod
	public void sign_out() {
		
		System.out.println("Sign out");
	
	}
	
	@AfterClass
	public void homepage() {
		
		System.out.println("Home page");

	}
	
	@AfterTest
	public void delete_cookies() {

		System.out.println("Delete cookies");

	}
	
	@AfterSuite
	public void close_browser() {
		
		System.out.println("Close Browser");

	}
	
	
}
