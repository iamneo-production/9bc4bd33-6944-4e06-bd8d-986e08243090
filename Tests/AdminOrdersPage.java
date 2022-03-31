package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminOrdersPage {
	@Given("Admin successfully logins and clicks on {string} link")
	public void admin_successfully_logins_and_clicks_on_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
		}

	@When("Admin clicks on {string} link it will navigate to that page")
	public void admin_clicks_on_link_it_will_navigate_to_that_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@Then("Admin can see all the details like {string},{string},{string},{string}")
	public void admin_can_see_all_the_details_like(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("Admin can {string} and {string} the {string}")
	public void admin_can_and_the(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

}
