@simpleLogin @Datadriven
Feature: Simple login feature for OrangeHRM
Scenario: Login Scenario with valid username  and password
Given User is on the login page of the orangehrm site
 When User enters the valid username and password
 And User clicks the login button
 Then User should be navigated to the home page  

