package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_details {
	
	@FindBy(id="first_name")
	
	private WebElement Firstname;
	
	public Personal_details(WebDriver S5) {
		
		PageFactory.initElements(S5,this);
		
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastmname() {
		return Lastmname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardno() {
		return Cardno;
	}

	public WebElement getCardtype() {
		return Cardtype;
	}

	public WebElement getCardexpmon() {
		return Cardexpmon;
	}

	public WebElement getCardexpyr() {
		return Cardexpyr;
	}

	public WebElement getCVVno() {
		return CVVno;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

	@FindBy(id="last_name")
	
	private WebElement Lastmname;
	
	@FindBy(id="address")
	
	private WebElement Address;
	
	@FindBy(id="cc_num")
	
	private WebElement Cardno;
	
	@FindBy(name="cc_type")
	
	private WebElement Cardtype;
	
	@FindBy(id="cc_exp_month")
	
	private WebElement Cardexpmon;
	
	@FindBy(id="cc_exp_year")
	
	private WebElement Cardexpyr;
	
	@FindBy(name="cc_cvv")
	
	private WebElement CVVno;
	
	@FindBy(id="book_now")
	
	private WebElement Booknow;
	
	

}
