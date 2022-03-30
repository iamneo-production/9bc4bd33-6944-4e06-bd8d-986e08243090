package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCartPage {
	@Given("User Succesfully login with all valid credentials")
	public void user_succesfully_login_with_all_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@When("User clicks on Cart link it navigates to that page")
	public void user_clicks_on_cart_link_it_navigates_to_that_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@Then("User can see Details of the Fish that are added to the {string}")
	public void user_can_see_details_of_the_fish_that_are_added_to_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("User can see {string},{string} and {string}")
	public void user_can_see_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("User can move the product to {string} or they can place the order directly")
	public void user_can_move_the_product_to_or_they_can_place_the_order_directly(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}
}
