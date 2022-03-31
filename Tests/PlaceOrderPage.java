package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderPage {
	@Given("User Succesfully login with and After successful login User {string} is visible")
	public void user_succesfully_login_with_and_after_successful_login_user_is_visible(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Given("User click on Cart link it navigates to that page")
	public void user_click_on_cart_link_it_navigates_to_that_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");

	}

	@Given("User can see the Details of the Fish that are added to the {string}")
	public void user_can_see_the_details_of_the_fish_that_are_added_to_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");

	}

	@Given("User can see the {string},{string} and {string}")
	public void user_can_see_the_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");

	}

	@When("User select the product and click on {string} it navigates to that page")
	public void user_select_the_product_and_click_on_it_navigates_to_that_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");

	}

	@Then("The entire Order details is displayed,User can select {string} option and click on {string}")
	public void the_entire_order_details_is_displayed_user_can_select_option_and_click_on(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:6");

	}
}
