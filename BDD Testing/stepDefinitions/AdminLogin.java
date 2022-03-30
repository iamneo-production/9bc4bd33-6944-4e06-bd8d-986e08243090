package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminLogin {
	@Given("Admin should enter their {string} and {string} for login")
	public void admin_should_enter_their_and_for_login(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Step:1");
	}

	@When("Admin enter their {string} and {string}")
	public void admin_enter_their_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		  System.out.println("Step:2");
	}

	@Then("Admin successfully logins")
	public void admin_successfully_logins() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		  System.out.println("Step:3");
	}

	@Then("Admin homepage is visible")
	public void admin_homepage_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		  System.out.println("Step:4");
	}


}
