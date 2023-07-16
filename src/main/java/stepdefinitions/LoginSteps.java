package stepdefinitions;

import pages.LoginPage;
import wrappers.GenericWrappers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends GenericWrappers{
	
	LoginPage loginPage = new LoginPage();
	
	
	@And("Enter username")
	public void enter_username() {
		loginPage.enterUserName();
	}

	@Given("Enter password")
	public void enter_password() {
		loginPage.enterPassword();
	}
	@When("Click login")
	public void click_login() throws InterruptedException {
		loginPage.clickLogin();

}
}