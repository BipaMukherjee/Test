@regression
Feature: Registration
Scenario: Register a new customer
    Given I am in registration page
    And I enter my name, surname, phone, email, password amd address
    And I select privacy policy
    When I click on continue
    Then I see an error message (customer allredy registered)

