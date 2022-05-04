package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out {
	
	public Log_out(WebDriver S6) {
		
		PageFactory.initElements(S6,this);
	}

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(name="logout")
	
	private WebElement Logout;
	

}
