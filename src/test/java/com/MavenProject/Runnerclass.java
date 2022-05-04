package com.MavenProject;

import org.openqa.selenium.WebDriver;

import com.properties.File_reader_manager;
import com.sdp.Page_object_manager;

public class Runnerclass extends Baseclass {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver S = Browserlaunch("chrome");

		Page_object_manager Pom = new Page_object_manager(S);
		
		String url = File_reader_manager.getInstanceFRM().getInstanceCR().geturl();
		
		Url_launch(url);
		
		String username = File_reader_manager.getInstanceFRM().getInstanceCR().getusername();

		Input_values(Pom.getInstanceLogin().getUsername(),username);
		
		String password = File_reader_manager.getInstanceFRM().getInstanceCR().getpassword();

		Input_values(Pom.getInstanceLogin().getPassword(),password);

		Click(Pom.getInstanceLogin().getLogin());

		Select_by_value(Pom.getInstanceHotel().getLocation(), "Melbourne");

		Select_by_value(Pom.getInstanceHotel().getHotels(), "Hotel Sunshine");

		Select_by_value(Pom.getInstanceHotel().getRoom_type(), "Super Deluxe");

		Select_by_visibletext(Pom.getInstanceHotel().getRoom_nos(), "6 - Six");

		Clear(Pom.getInstanceHotel().getCheckin());

		Input_values(Pom.getInstanceHotel().getCheckin(), "01/10/2022");

		Clear(Pom.getInstanceHotel().getCheckout());

		Input_values(Pom.getInstanceHotel().getCheckout(), "06/10/2022");

		Select_by_visibletext(Pom.getInstanceHotel().getAdults(), "2 - Two");

		Select_by_index(Pom.getInstanceHotel().getChild(), 1);

		Click(Pom.getInstanceHotel().getSubmit());
		
		Click(Pom.getInstanceSelection().getButton());
		
		Click(Pom.getInstanceSelection().getContinue());
		
		String firstname = File_reader_manager.getInstanceFRM().getInstanceCR().getfirstname();
		
		Input_values(Pom.getInstancePersonal().getFirstname(),firstname);
		
		String lastname = File_reader_manager.getInstanceFRM().getInstanceCR().getlastname();

		Input_values(Pom.getInstancePersonal().getLastmname(),lastname);
		
		String address = File_reader_manager.getInstanceFRM().getInstanceCR().getaddress();

		Input_values(Pom.getInstancePersonal().getAddress(),address);
		
		String cardno = File_reader_manager.getInstanceFRM().getInstanceCR().getcardno();

		Input_values(Pom.getInstancePersonal().getCardno(),cardno);

		Select_by_visibletext(Pom.getInstancePersonal().getCardtype(), "Master Card");

		Select_by_index(Pom.getInstancePersonal().getCardexpmon(), 10);

		Select_by_value(Pom.getInstancePersonal().getCardexpyr(), "2022");
		
		String cvvno = File_reader_manager.getInstanceFRM().getInstanceCR().getcvvno();

		Input_values(Pom.getInstancePersonal().getCVVno(),cvvno);

		Click(Pom.getInstancePersonal().getBooknow());
		
		Thread.sleep(5000);

		Screen_shot("C:\\Users\\sudhe\\Susa\\MavenProject\\Screenshot\\Booking.png");
		
		Thread.sleep(3000);
		
		Click(Pom.getInstanceLogout().getLogout());
		
	}

}
