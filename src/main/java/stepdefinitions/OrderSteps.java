package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.OrderPage;
import wrappers.GenericWrappers;

public class OrderSteps extends GenericWrappers{
	
	OrderPage orderPage = new OrderPage();
	
	@Then ("Click Mobile")
	public void click_mobile() throws InterruptedException {
		orderPage.clickMobile();
	}

}
