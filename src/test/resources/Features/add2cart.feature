@regression
@sanity
Feature: Add to cart
Scenario: Add to cart
Given I am in PDP
When I click add to cart button
Then Product gets added to the basket
And Product is available on basket page
