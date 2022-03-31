package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrackingPage {
	@Given("User Succesfully login with all the valid credentials")
	public void user_succesfully_login_with_all_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Given("After successful login User Home Page is visible")
	public void after_successful_login_user_home_page_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@When("User click on {string} link it navigates to that page")
	public void user_click_on_link_it_navigates_to_that_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("User clicks on {string} button and navigates to {string} page")
	public void user_clicks_on_button_and_navigates_to_page(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("The Order {string} is visible and User can click on available options for any {string}")
	public void the_order_is_visible_and_user_can_click_on_available_options_for_any(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}


}
