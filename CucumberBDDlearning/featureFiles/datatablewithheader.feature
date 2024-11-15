Feature: login feature scenario for OrangeHRM site
@Datadriven
  Scenario: Login test Scenario with the valid credentias
    Given you should be on the login page of orangehrm url
    When you enters the valid credentials
      | UserName | Password |
      | Admin    | admin123 |
    And User selects the login button
