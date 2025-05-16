Feature: Product Ordering

  Scenario: User can place an order with a new address
    Given The user logs
    When The user adds a random product to the cart
    And The user fills in the shipping address:
      | company     | phoneNumber | street       | city     | state   | zipCode | country        |
      | TechnoStudy | 1233333     | Michigan 10A | New York | Alabama | AB12    | United States  |
    And The user saves the address and continues
    And The user selects a shipping method and proceeds to payment
    And The user confirms billing address and places the order
    Then The user should see a success message and order number
