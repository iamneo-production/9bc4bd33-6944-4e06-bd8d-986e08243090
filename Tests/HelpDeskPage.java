package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HelpDeskPage {
	@Given("Given User Succesfully logins with all valid credentials")
	public void given_user_succesfully_logins_with_all_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Then("User clicks on {string} button and navigates to the {string} page")
	public void user_clicks_on_button_and_navigates_to_the_page(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@Then("the User can select any appropriate sevice")
	public void the_user_can_select_any_appropriate_sevice() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

}
