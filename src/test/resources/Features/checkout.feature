@regression
Feature: Checkout
Scenario: Checkout as a regular customer
Given I am on basket page with a product
And I click on continue to checkout and land on login page
When I login with valid data
And I get connected to order confirm page
And I select payment and shipping type
And I select privacy policy checkbox
And I click on continue and get connected to payment page
And I provide payment details and continue
Then After payment is successfull I can see thank you page
