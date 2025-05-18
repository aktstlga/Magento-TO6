Feature: : Adding a new address to the user profile

  Background:
    Given Navigate to Magento and Login Page
    When Enter E-mail and and password and click on the login button
    Then User should login successfully

  @Regression
  Scenario Outline: User adds a new address with valid information
    And The user navigates to the My Account section
    And The user opens the address section
    When The user fills in the company, phone number, and street fields with "<company>", "<phoneNumber>", and "<street>"
    And The user selects "<country>" as country, which enables selection of "<city>", "<state>", and "<zipCode>"
    And The user saves the address

    Examples:
      | company         | phoneNumber       | street                | city        | state    | zipCode  | country        |
      | Thornridge Ltd  | +44 7911 123456   | 221B Baker Street     | London      | England  | AB12 3CD | United Kingdom |
      | Greenvale Foods | +44 7700 900123   | 58 Rosehill Avenue    | Manchester  | England  | M14 5LT  | United Kingdom |
      | Redwood Systems | +1 (415) 555-0198 | 742 Evergreen Terrace | Springfield | Illinois | 62704    | United States  |