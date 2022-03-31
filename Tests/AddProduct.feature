Feature: Add Product
Scenario: Admin Add Product Page
Given Admin can add new "Product"
When Admin adds product "Name",product "ID",product "Image" and product "Quantity"
And Admin clicks on "Confirm" button
Then "New Product" is added to the "Products" page
 