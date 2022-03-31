Feature: Cart Page
Scenario: Users Cart Page
Given User Succesfully login with all valid credentials
When After successful login User Homepage is visible 
And User clicks on Cart link it navigates to that page
Then User can see Details of the Fish that are added to the "Cart"
And User can see "Product Name","Price" and "Quantity"
And User can move the product to "WishList" or they can place the order directly
