package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSignupPage {
	@Given("User opens the {string} and click the website")
	public void user_opens_the_and_click_the_website(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}
	@Given("It asks for {string}")
	public void it_asks_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@When("User enters their {string},{string},{string},{string}")
	public void user_enters_their(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("User successfully creates an {string}")
	public void user_successfully_creates_an(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}

	@Then("USer should complete their {string}")
	public void u_ser_should_complete_their(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

}
