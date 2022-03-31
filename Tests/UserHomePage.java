package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserHomePage {
	@Given("User Successfully Logins with {string} Credentials")
	public void user_successfully_logins_with_credentials(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@When("After Successful Login User {string} is visible")
	public void after_successful_login_user_is_visible(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@Then("User can see all the different types for {string} on the page")
	public void user_can_see_all_the_different_types_for_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

}
