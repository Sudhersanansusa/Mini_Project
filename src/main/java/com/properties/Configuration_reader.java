package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {
	
	public static Properties P;
	
	public Configuration_reader() throws Throwable {
		
		File F = new File("C:\\Users\\sudhe\\Susa\\MavenProject\\src\\main\\java\\Adactin.properties");
		
		FileInputStream FI = new FileInputStream(F);
		
		P =  new Properties();
		
		P.load(FI);
		
	}
	
	public String geturl() {
		
		String Url = P.getProperty("Url");
		
		return Url;

	}
	
	public String getusername() {
		
		String username = P.getProperty("Username");
		
		return username;

	}
	
	public String getpassword() {
		
		String password = P.getProperty("Password");
		
		return password;

	}
	
	public String getfirstname() {

		String firstname = P.getProperty("Firstname");
		
		return firstname;

	}
	
	public String getlastname() {
		
		String lastname = P.getProperty("Lastname");
		
		return lastname;

	}
	
	public String getaddress() {

		String address = P.getProperty("Address");
		
		return address;

	}
	
	public String getcardno() {
		
		String cardno = P.getProperty("Cardno");
		
		return cardno;

	}
	
	public String getcvvno() {
	
		String cvvno = P.getProperty("CVVno");
		
		return cvvno;

	}

	public Configuration_reader getInstanceCR() {
		// TODO Auto-generated method stub
		return null;
	}

}
