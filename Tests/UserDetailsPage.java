package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserDetailsPage {
	@Given("Admin successfully logins and clicks on {string}")
	public void admin_successfully_logins_and_clicks_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@When("Admin clicks on {string} link it navigates to that page")
	public void admin_clicks_on_link_it_navigates_to_that_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@Then("All the details like {string},{string},{string},{string} is visible")
	public void all_the_details_like_is_visible(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("Admin can {string},{string} and {string} the users details")
	public void admin_can_and_the_users_details(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

}
