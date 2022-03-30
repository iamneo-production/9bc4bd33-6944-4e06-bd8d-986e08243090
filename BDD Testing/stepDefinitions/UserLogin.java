package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLogin{

@Given("User should enter their {string} and {string} for login")
public void user_should_enter_their_and_for_login(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    System.out.println("Step:1");
}

@When("User enter their {string} and {string}")
public void user_enter_their_and(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("Step:2");
}

@Then("User successfully logins")
public void user_successfully_logins() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("Step:3");
}

@Then("User homepage is visible")
public void user_homepage_is_visible() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("Step:4");
}
}
