Feature: SignUp Page
Scenario: User Sign Up
Given User opens the "Browser" and click the website 
And It asks for "Sign Up"
When User enters their "Email-id","UserName","MobileNumber","Password"
And User clicks on "Submit" button
Then User successfully creates an "Account"
And USer should complete their "Login"