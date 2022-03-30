package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FishDescriptionPage {
	@Given("After Successful {string} with all valid Credentials")
	public void after_successful_with_all_valid_credentials(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Given("the User Homepage with all the {string} of Fishes is visible")
	public void the_user_homepage_with_all_the_of_fishes_is_visible(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@When("User clicks on the Fish Image it navigates to {string} Page")
	public void user_clicks_on_the_fish_image_it_navigates_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@Then("The {string} of that fish,its {string} and all the required details is present")
	public void the_of_that_fish_its_and_all_the_required_details_is_present(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("The Fish can be added to {string} or can {string} them directly")
	public void the_fish_can_be_added_to_or_can_them_directly(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}
}
