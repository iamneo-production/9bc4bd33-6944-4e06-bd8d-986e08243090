Feature: Place Order
Scenario: User Place Order Page
Given User Succesfully login with and After successful login User "Homepage" is visible 
And User click on Cart link it navigates to that page
And User can see the Details of the Fish that are added to the "Cart"
And User can see the "Product Name","Price" and "Quantity"
When User select the product and click on "Place Order" it navigates to that page
Then The entire Order details is displayed,User can select "Pay On Delivery" option and click on "Continue"