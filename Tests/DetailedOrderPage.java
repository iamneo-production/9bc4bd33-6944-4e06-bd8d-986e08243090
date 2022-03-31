package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DetailedOrderPage {
	@Given("Admin successfully logins and clicks on the {string} link")
	public void admin_successfully_logins_and_clicks_on_the_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@When("Admin clicks on {string} link it navigates to that particular page")
	public void admin_clicks_on_link_it_navigates_to_that_particular_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@Then("Admin clicks on Detailed order {string} present after {string}")
	public void admin_clicks_on_detailed_order_present_after(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("Admin navigates to the {string} page")
	public void admin_navigates_to_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("Admin can see {string},{string},{string},{string}")
	public void admin_can_see(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}

	@Then("Product {string},{string} and {string} of the orders")
	public void product_and_of_the_orders(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:6");
	}

}
