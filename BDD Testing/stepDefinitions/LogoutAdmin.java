package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutAdmin {
	@Given("Admin successfully logins and performs all required {string}")
	public void admin_successfully_logins_and_performs_all_required(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Given("Admin clicks on {string} link")
	public void admin_clicks_on_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@When("Admin clicks on {string} link it navigates to the page")
	public void admin_clicks_on_link_it_navigates_to_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("Admin click on {string} button")
	public void admin_click_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("Admin successfully logouts")
	public void admin_successfully_logouts() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}

	@When("Admin wants to {string} again")
	public void admin_wants_to_again(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:6");
	}

	@Then("Admin clicks on {string}")
	public void admin_clicks_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:7");
	}

}
