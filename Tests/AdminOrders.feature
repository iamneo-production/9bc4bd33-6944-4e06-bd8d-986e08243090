Feature: Order Details
Scenario: Order Details for Admin
Given Admin successfully logins and clicks on "Orders" link
When Admin clicks on "Orders" link it will navigate to that page
Then Admin can see all the details like "Order ID","User ID","Order Date","Status"
And Admin can "Search" and "Delete" the "Orders"
