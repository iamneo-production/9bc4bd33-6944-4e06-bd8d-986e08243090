Feature: Logout Page
Scenario: Admin Logout Page
Given Admin successfully logins and performs all required "Operations"
And Admin clicks on "Logout" link 
When Admin clicks on "Logout" link it navigates to the page
Then Admin click on "Yes,Log me out" button
And Admin successfully logouts
When Admin wants to "login" again
Then Admin clicks on "Login Again" 