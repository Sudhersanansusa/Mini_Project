package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Hotel_details;
import com.pomclass.Log_in;
import com.pomclass.Log_out;
import com.pomclass.Personal_details;
import com.pomclass.Selection;

public class Page_object_manager {
	
		public static WebDriver S;
		
		public Page_object_manager(WebDriver S2) {
			
			this.S = S2;
			
		}

		private static Log_in LI;
		
		public Log_in getInstanceLogin() {
			
			if (LI==null) {
				
				LI = new Log_in(S);
				
			}
			
			return LI;
		}
		
		private static Hotel_details HD;
		
		public Hotel_details getInstanceHotel() {
			
			if (HD==null) {
				
				HD = new Hotel_details(S);
				
			}
		
			return HD;
		}
		
		private static Selection SE;
		
		public Selection getInstanceSelection() {
		
			if (SE==null) {
				
				SE = new Selection(S);
			}
			
			return SE;
		}
		
		private static Personal_details PD;
		
		public Personal_details getInstancePersonal() {
			
			if (PD==null) {
				
				PD = new Personal_details(S);
				
			}
			
			return PD;

		}
		
		private static Log_out LO;
		
		public Log_out getInstanceLogout() {
			
			if (LO==null) {
				
				LO = new Log_out(S);
				
			}
			
			return LO;

		}


}
