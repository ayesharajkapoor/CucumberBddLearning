Feature: login  scenario feature for OrangeHRM site
@Datadriven
  Scenario Outline: Login test feature with the valid credentias
    Given User should be on the login page of orangehrm url
    When User must enter the valid credentials username as "<UserName>" and password as "<Password>"
    And User clicks the login button after provided credentials

    Examples: 
      | UserName | Password |
      | Admin1   | admin123 |
      | Admin    | admin123 |
