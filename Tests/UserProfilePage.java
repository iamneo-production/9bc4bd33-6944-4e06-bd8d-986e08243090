package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserProfilePage {
	@Given("User Succesfully logins with all valid credentials")
	public void user_succesfully_logins_with_all_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@When("After successful login User Homepage is visible")
	public void after_successful_login_user_homepage_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@When("User clicks on Profile link it navigates to that page")
	public void user_clicks_on_profile_link_it_navigates_to_that_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("all the {string} of User like {string},{string},{string} and {string} is present")
	public void all_the_of_user_like_and_is_present(String string, String string2, String string3, String string4, String string5) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("User can enter all their details and save the changes")
	public void user_can_enter_all_their_details_and_save_the_changes() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}

}
