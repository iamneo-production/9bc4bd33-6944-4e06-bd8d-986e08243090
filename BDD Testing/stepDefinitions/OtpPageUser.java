package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OtpPageUser {
	@Given("User Successfully creates an {string}")
	public void user_successfully_creates_an(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:1");
	}

	@Given("User gets {string}")
	public void user_gets(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:2");
	}

	@When("User enters received {string}")
	public void user_enters_received(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:3");
	}

	@When("clicks on {string} button")
	public void clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:4");
	}

	@When("After Successful verification")
	public void after_successful_verification() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Step:5");
	}

	@Then("User enters into {string} page")
	public void user_enters_into_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Step:6");
	}


}
