Feature: Wish List functionality with login and search

  Background:
    Given Navigate to Magento and Login Page
    When Enter E-mail and and password and click on the login button

  Scenario: Search product, add to Wish List, verify and remove from Wish List
    When The user enters "MJ08" into the search box and clicks the search icon
    And The user clicks on the product image of "Lando Gym Jacket"
    And The user adds the product to the wish list
    Then A confirmation message "Lando Gym Jacket has been added to your Wish List." should be visible
    When The user removes the product from the wish list
    Then A confirmation message "Lando Gym Jacket has been removed from your Wish List." should be visible