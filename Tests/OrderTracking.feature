Feature: Order Tracking
Scenario: Order Tracking Page
Given User Succesfully login with all the valid credentials
And After successful login User Home Page is visible 
When User click on "MyOrders" link it navigates to that page
Then User clicks on "Click Here to See More" button and navigates to "Tracking" page
And The Order "Status" is visible and User can click on available options for any "Help"