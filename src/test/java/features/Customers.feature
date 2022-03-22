Feature: Customers

Scenario: Add a new customer
Given user lauches the browser
When user opens the app page "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And user enters the email as "admin@yourstore.com" and password as "admin"
And click login
Then user can view dashboard
When user clicks on customer menu
And clicks customers menu item
And click on add new button
Then user can view add new customer page
When user enter customer info
And click on save button
Then User can view the confirmation message "The new customer has been added successfully."
And close browser
