Feature: : Adding a new address to the user profile

  Scenario Outline: User adds a new address with valid information
    Given The user logs in
    And The user navigates to the My Account section
    And The user opens the address section
    When The user fills in the new address form with:
      | companyPlaceholder     | <company>     |
      | phoneNumberPlaceholder | <phoneNumber> |
      | streetPlaceholder      | <street>      |
      | cityPlaceholder        | <city>        |
      | statePlaceholder       | <state>       |
      | zipCodePlaceholder     | <zipCode>     |
      | countryPlaceholder     | <country>     |
    And The user saves the address

    Examples:
      | company       | phoneNumber | street       | city         | state       | zipCode       | country       |
      | companyRandom | phoneRandom | streetRandom | streetRandom | stateRandom | zipCodeRandom | countryRandom |
