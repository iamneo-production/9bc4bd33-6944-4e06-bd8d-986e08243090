Feature: Fish Description
Scenario: User Fish Description Page
Given After Successful "Login" with all valid Credentials
And the User Homepage with all the "Images" of Fishes is visible
When User clicks on the Fish Image it navigates to "Description" Page
Then The "Rating" of that fish,its "Price" and all the required details is present
And The Fish can be added to "Cart" or can "Buy" them directly