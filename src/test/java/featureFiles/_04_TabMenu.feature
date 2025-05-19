Feature: Cart Transactions functionality

  Background:
    Given Navigate to Magento and Login Page
    When Enter E-mail and and password and click on the login button

  @SmokeTest
  Scenario: Adding and removing products from the cart
    Given In the user tab menu, navigate to Women branches
    Then In the user tab menu, navigate to Men branches
    And In the user tab menu, navigate to Gear
    Then In the user tab menu, hover over Training