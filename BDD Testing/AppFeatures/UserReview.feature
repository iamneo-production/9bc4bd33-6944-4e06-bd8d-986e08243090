Feature: Review Page
Scenario: User Review Page for Fishes
Given User Successfully Logins 
And User HomePage is Visible 
And User when clicked on Fish Image navigates to "Description page"
When User clicks on the "Ratings" it navigates to "Review Page"
Then User can "Add","Delete" and "Update" the Reviews 