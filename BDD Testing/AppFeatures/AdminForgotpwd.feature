Feature: Forgot Password
Scenario: Admin Forgot Password Page
Given If Admin Forgot their "Password" they have to enter their "Email-id"
When Admin enters their "Email-id" 
And Clicks on Login 
Then Admin logins and  Homepage is visible
