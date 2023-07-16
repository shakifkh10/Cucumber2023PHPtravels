package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.ProfilePage;

public class ProfileSteps {
	
	ProfilePage profilePage = new ProfilePage();
	
	@Then("Click Services")
	public void click_Services() throws InterruptedException {
		profilePage.clickServices();
	}

}
