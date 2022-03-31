Feature: Profile Page
Scenario: User Profile Page
Given User Succesfully logins with all valid credentials
When After successful login User Homepage is visible 
And User clicks on Profile link it navigates to that page
Then all the "Personal Information" of User like "Name","Email Address","Mobile Number" and "Address" is present
And User can enter all their details and save the changes