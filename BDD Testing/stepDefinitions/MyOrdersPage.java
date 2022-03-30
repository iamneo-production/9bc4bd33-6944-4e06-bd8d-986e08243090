package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyOrdersPage {
	@Given("User Succesfully logins with all the valid credentials")
	public void user_succesfully_logins_with_all_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Given("After successful login User Home page is visible")
	public void after_successful_login_user_home_page_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");

	}

	@When("User clicks on {string} link it navigates to that page")
	public void user_clicks_on_link_it_navigates_to_that_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");

	}

	@Then("User Ordered {string},{string} of the Order,{string}")
	public void user_ordered_of_the_order(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");

	}

}
