package pages;

import org.openqa.selenium.remote.RemoteWebDriver;



import wrappers.GenericWrappers;

public class ProfilePage extends GenericWrappers {

	
	public OrderPage clickServices() throws InterruptedException{
		clickByXpath("//li[@menuitemname='Services']");
		Thread.sleep(500);
		clickByXpath("//li[@menuitemname='Order New Services']");
		Thread.sleep(500);

		return new OrderPage(); 
		
	
	}
}


