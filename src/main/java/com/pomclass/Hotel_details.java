package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_details {
	
	@FindBy(name="location")
	
	private WebElement Location;

	public Hotel_details(WebDriver S3) {
		
		PageFactory.initElements(S3,this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoom_type() {
		return Room_type;
	}

	public WebElement getRoom_nos() {
		return Room_nos;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChild() {
		return Child;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(id="hotels")
	
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	
	private WebElement Room_type;
	
	@FindBy(id="room_nos")
	
	private WebElement Room_nos;
	
	@FindBy(id="datepick_in")
	
	private WebElement Checkin;
	
	@FindBy(id="datepick_out")
	
	private WebElement Checkout;
	
	@FindBy(id="adult_room")
	
	private WebElement Adults;
	
	@FindBy(name="child_room")
	
	private WebElement Child;
	
	@FindBy(id="Submit")
	
	private WebElement Submit;

}
