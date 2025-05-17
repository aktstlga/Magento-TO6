Feature: Search Functionality

  Scenario: Valid SKU search should return the correct product
    Given The user is on the home page
    When The user enters SKU "MJ08" into the search box and presses Enter
    Then The product named "Lando Gym Jacket" should be displayed in the search results
    And The user clicks on the product
    Then The product detail page should display SKU as "MJ08"

  Scenario: Invalid SKU search should return no results
    Given The user is on the home page
    When The user enters SKU "INVALID123" into the search box and presses Enter
    Then A message "Your search returned no results." should be displayed
