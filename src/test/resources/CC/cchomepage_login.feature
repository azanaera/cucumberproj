@Login
Feature: Browsing on CC Login Page
	Verify if steps can browse into CC Page	
	    
Scenario Outline: Logging In
  Given I am on the Login page 
  When I fill in username with <user> and password with <pass>
  Then I should see the HomePage
  
  Examples:
    | user | pass |
    | "su" | "gw" |