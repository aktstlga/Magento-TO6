Feature: : Adding a new address to the user profile

  Scenario Outline: User adds a new address with valid information
    Given The user logs
    And The user navigates to the My Account section
    And The user opens the address section
    When The user fills in the company, phone number, and street fields with "<company>", "<phoneNumber>", and "<street>"
    And The user selects "<country>" as country, which enables selection of "<city>", "<state>", and "<zipCode>"
    And The user saves the address

    Examples:
      | company       | phoneNumber | street       | city | state | zipCode       | country        |
      | companyRandom | phoneRandom | streetRandom | city | asd   | zipCodeRandom | United Kingdom |