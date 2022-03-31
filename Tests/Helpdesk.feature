Feature: HelpDesk 
Scenario: User HelpDesk Page
Given Given User Succesfully logins with all valid credentials
And After successful login User Homepage is visible 
When User clicks on Profile link it navigates to that page
And all the "Personal Information" of User like "Name","Email Address","Mobile Number" and "Address" is present
And User can enter all their details and save the changes
Then User clicks on "NeedHelp" button and navigates to the "HelpDesk" page
And the User can select any appropriate sevice
 