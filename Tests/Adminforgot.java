package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adminforgot {
	@Given("If Admin Forgot their {string} they have to enter their {string}")
	public void if_admin_forgot_their_they_have_to_enter_their(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@When("Admin enters their {string}")
	public void admin_enters_their(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("Admin logins and  Homepage is visible")
	public void admin_logins_and_homepage_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

}
