package com.Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_concept {
	
	@Test@Parameters({ "Login_id" , "Password" })
	public void log_in(String Login_id,String Password) {
		
		System.out.println("Login ID :"+ Login_id );
		
		System.out.println("Password :"+ Password );

	}

}
