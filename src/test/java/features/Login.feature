Feature: Verify the login feature of nopcommerce site 

Scenario: Successful  login with valid credential 
	Given user launches the nopcommerece site "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
	When user enters the valid username as "admin@yourstore.com" and password as "admin" 
	And click on login 
	Then page title should be "Dashboard / nopCommerce administration"; 
	When user click logout link 
	Then user should be "Your store. Login" 
	And close browser 
	
Scenario Outline: : Successful  login with valid credential 
	Given user launches the nopcommerece site 
	When user enters the valid username as "admin@yourstore.com" and password as "admin" 
	And click on login 
	Then page title should be "Dashboard / nopCommerce administration"; 
	When user click logout link 
	Then user should be "Your store. Login" 
	And close browser
	
	Examples:
		|email|password|
		|admin@yourstore.com|admin|
		|admin1@yourstore.com|admin|
		