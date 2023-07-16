package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class OrderPage extends GenericWrappers {
	

	public CheckOutPage clickMobile() throws InterruptedException{
		clickByXpath("//a[@menuitemname='Mobile']");
		Thread.sleep(500);
		clickById("product1-order-button");
		
		return new CheckOutPage(); 
	
	
	}
	
	
	
	
	}


	


