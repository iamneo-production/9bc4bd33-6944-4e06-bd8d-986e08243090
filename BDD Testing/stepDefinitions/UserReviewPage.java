package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserReviewPage {
	@Given("User Successfully Logins")
	public void user_successfully_logins() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Given("User HomePage is Visible")
	public void user_home_page_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@Given("User when clicked on Fish Image navigates to {string}")
	public void user_when_clicked_on_fish_image_navigates_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@When("User clicks on the {string} it navigates to {string}")
	public void user_clicks_on_the_it_navigates_to(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@Then("User can {string},{string} and {string} the Reviews")
	public void user_can_and_the_reviews(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}

}
