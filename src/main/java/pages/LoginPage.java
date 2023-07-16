package pages;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;


import wrappers.GenericWrappers;


public class LoginPage extends GenericWrappers{
	
	/*
	 * public LoginPage () { PageFactory.initElements(driver, this); }
	 * 
	 * @FindBy(name="uid")
	 * 
	 * WebElement user99GuruName;
	 * 
	 * @FindBy(id="userName") WebElement username;
	 * 
	 * @FindBy(id="password") WebElement password;
	 * 
	 * @FindBy(id="login") WebElement loginButton;
	 */
			
		
		public LoginPage enterUserName(){
			enterById("inputEmail", UN);
			return this;
		}
		
		public LoginPage enterPassword(){
			enterById("inputPassword", PW);
			return this;
			
		}
		
		public ProfilePage clickLogin() throws InterruptedException{
			Thread.sleep(40000);
			clickById("login");		
			return new ProfilePage();
		}
		
}



