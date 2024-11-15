Feature: To test the login feature for OrangeHRM site
@Datadriven
  Scenario: Login Scenario with the valid credentias
    Given User is on the login page of orangehrm url
    When User enters the valid credentials
      | Admin | admin123 |
    And User click the login button after entered the credentials
