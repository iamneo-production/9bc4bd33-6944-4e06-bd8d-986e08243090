Feature: Forgot Password
Scenario: User Forgot Password Page
Given If User Forgot their "Password" they have to enter their "Email-id"
When User enters their "Email-id" 
And Clicks on "Login Again" button
Then User logins and  Homepage is visible
