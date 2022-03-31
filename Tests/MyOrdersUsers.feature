Feature: Orders Page
Scenario: Users MyOrders Page
Given User Succesfully logins with all the valid credentials
And After successful login User Home page is visible 
When User clicks on "MyOredrs" link it navigates to that page
Then User Ordered "Product Name","Status" of the Order,"Ordered Date"
