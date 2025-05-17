Feature: Product Ordering Process

  Background:
    Given Navigate to Magento and Login Page
    When Enter E-mail and and password and click on the login button

  @Regression
  Scenario: Order a product with existing Address Book address
    And User selects a product from Men's section and adds it to the cart
    And User proceeds to checkout
    And User confirms default address and selects shipping method
    And User selects payment method and places the order
    Then Order should be placed successfully
