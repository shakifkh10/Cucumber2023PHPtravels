package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.CheckOutPage;
import wrappers.GenericWrappers;

public class CheckOutSteps extends GenericWrappers{
	
	CheckOutPage checkoutPage = new CheckOutPage();
	
	@Then ("Click Order")
	public void click_order() throws InterruptedException {
		checkoutPage.clickOrder();
	}

}
