package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminProduct {

@Given("Admin successfully logins and the homepage is visible")
public void admin_successfully_logins_and_the_homepage_is_visible() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
    System.out.println("Step:1");
}

@Given("Admin clicks on the {string} link")
public void admin_clicks_on_the_link(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	 System.out.println("Step:2");
}

@When("Admin clicks on the {string} link it navigates to that page")
public void admin_clicks_on_the_link_it_navigates_to_that_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	 System.out.println("Step:3");
}

@Then("Admin will be able to see all the {string} details")
public void admin_will_be_able_to_see_all_the_details(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	 System.out.println("Step:4");
}

@Then("Admin can {string},{string} and {string} the {string}")
public void admin_can_and_the(String string, String string2, String string3, String string4) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	 System.out.println("Step:5");
}

}
