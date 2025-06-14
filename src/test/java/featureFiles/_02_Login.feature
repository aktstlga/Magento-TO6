Feature: Login functionality

  @SmokeTest
  Scenario: Login with valid e-mail and password
    Given Navigate to Magento and Login Page
    When Enter E-mail and and password and click on the login button
    Then User should login successfully
    And User should logout and close the page