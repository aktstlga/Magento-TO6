Feature: Cart Transactions functionality

  Background:
    Given Navigate to Magento and Login Page
    When Enter E-mail and and password and click on the login button
    Then User should login successfully

  Scenario: Adding and removing products from the cart
    Given User should purchase an item from the men's section