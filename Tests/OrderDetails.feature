Feature: Detailed Order Page
Scenario: Total Details Of Orders for Admin
Given Admin successfully logins and clicks on the "Orders" link
When Admin clicks on "Orders" link it navigates to that particular page
Then Admin clicks on Detailed order "Icon" present after "Status"
And Admin navigates to the "Detailed Order" page
And Admin can see "Order Id","Order Date","Bill To","Ship To" 
And Product "Quantity","Amount" and "Total Price" of the orders