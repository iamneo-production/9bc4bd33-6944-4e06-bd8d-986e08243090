Feature: User Details
Scenario: User Details for Admin
Given Admin successfully logins and clicks on "Users"
When Admin clicks on "Users" link it navigates to that page
Then All the details like "User ID","User Name","Email-id","Mobile Number" is visible
And Admin can "Search","Edit" and "Delete" the users details
