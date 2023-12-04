@regression
Feature: Pagination
 Scenario: change page from pagination
    Given I am on category result page
    When I click on different page number
    Then I land on to selected page


