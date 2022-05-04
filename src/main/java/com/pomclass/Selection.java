package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection {
	
	@FindBy(id="radiobutton_0")
	
	private WebElement Button;
	
	public Selection(WebDriver S4) {
		
		PageFactory.initElements(S4,this);

	}

	public WebElement getButton() {
		return Button;
	}

	public WebElement getContinue() {
		return Continue;
	}

	@FindBy(name="continue")
	
	private WebElement Continue;

}
