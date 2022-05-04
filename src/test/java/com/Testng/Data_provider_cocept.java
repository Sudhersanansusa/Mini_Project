package com.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_cocept {
	

	@Test(dataProvider = "inputs")
	public void log_in(String Login_id,String Password) {
		
		System.out.println("Login ID :"+ Login_id );
		
		System.out.println("Password :"+ Password );

	}
	
	@DataProvider
	public Object[][] inputs() {

		return new Object[][] {
			
			{ "Dhoni" , "07" },
			
			{ "Rohit" , "45" },
			
			{ "Virat" , "18" }
			
		};
		
	}
	
}


