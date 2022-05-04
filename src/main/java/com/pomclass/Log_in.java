package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in {
	
	public WebDriver S;
	
	@FindBy(id="username")
	
	private WebElement Username;
	
	public Log_in(WebDriver S2) {
		this.S = S2;
		PageFactory.initElements(S,this);
		
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	@FindBy(id="password")
	
	private WebElement Password;
	
	@FindBy(id="login")
	
	private WebElement Login;

}
