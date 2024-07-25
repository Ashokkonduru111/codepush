package com.OBDX.StepDefinations;
import java.util.TreeMap;

import com.OBDX.PageObject.STDCIFpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class STDCIFsteps extends STDCIFpage {
	
	STDCIFpage page=new STDCIFpage();

		@Given("navigate to the screen of STDCIF")
		public void navigate_to_the_screen_of_stdcif() throws Exception {
			
			page.login();
			page.fast_path();
		}

		@Then("enter all the details STDCIF")
		public void enter_all_the_details_stdcif() throws Throwable {
			page.All_steps();

		}

		@Then("save the recorde STDCIF")
		public void save_the_recorde_stdcif() throws Exception {
			page.save();

		}

		@Then("exit and logout STDCIF")
		public void exit_and_logout_stdcif() throws Exception {
			
			

		}


	


}
