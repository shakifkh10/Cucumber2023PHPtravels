package stepdefinitions;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class CommonSteps extends GenericWrappers{
	
GenericWrappers wrapper = new GenericWrappers();
	
	@Given("Opening the browser")
	public void opening_the_browser() {
		wrapper.invokeApp("chrome", "https://phptravels.org/login");
	}
}

