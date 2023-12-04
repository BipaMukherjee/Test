@regression
Feature: Filter


  Scenario: Check price filter
  Given I am on category page
  When I enter maximum price value
  Then I get related results
  
Scenario: Check brand filter
Given I am on category page
When I select a brand from brand filter
Then I see that brands products
