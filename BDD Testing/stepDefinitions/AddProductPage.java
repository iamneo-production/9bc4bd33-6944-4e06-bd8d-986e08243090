package stepDefinitions;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class AddProductPage {
		@Given("Admin can add new {string}")
		public void admin_can_add_new(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
			System.out.println("Step:1");
		}

		@When("Admin adds product {string},product {string},product {string} and product {string}")
		public void admin_adds_product_product_product_and_product(String string, String string2, String string3, String string4) {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			System.out.println("Step:2");
		}

		@When("Admin clicks on {string} button")
		public void admin_clicks_on_button(String string) {
		    // Write code here that turns the phrase above into concrete actions
		 //   throw new io.cucumber.java.PendingException();
			System.out.println("Step:3");
		}

		@Then("{string} is added to the {string} page")
		public void is_added_to_the_page(String string, String string2) {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			System.out.println("Step:4");
		}

	}


