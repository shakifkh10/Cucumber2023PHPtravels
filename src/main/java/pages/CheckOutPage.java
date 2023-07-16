package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;


public class CheckOutPage  extends GenericWrappers {
	
	public CheckOutPage(){
		PageFactory.initElements(driver, this);				

	}
	

	public CheckOutPage clickOrder() throws InterruptedException{
		
		verifyTextContainsByXpath("//p[@class='product-title']","Mobile Applications");
		clickByXpath("//div[@class='panel-price']");
		Thread.sleep(500);
		clickById("btnCompleteProductConfig");
		clickById("checkout");
		clickById("btnCompleteOrder");
		Thread.sleep(3000);
		System.out.println((driver.findElement(By.xpath("//h3[contains(text(),'Invoice')]"))).getText());
		Thread.sleep(1500);
		return new CheckOutPage(); 
		
		//driver.findElement(By.ByXPath(     ) )

}
}
