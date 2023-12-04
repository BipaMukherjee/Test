@regression
Feature: Wishlist
Scenario: Check products in wishlist
    Given I login using my correct credentials
    When I click on wishlist icon on header
    Then I land onto wishlist page
    

