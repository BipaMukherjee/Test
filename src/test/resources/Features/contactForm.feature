
@regression
Feature: Contct Form Submission

Scenario: Submit general inquiry form
Given I have opened general inquiry form
When I entered all details to general inquiry form
And I accept T&C of the general inquiry form
And I click to submit the general inquiry form
Then I get connected to PDP and see alert message of general inquiry form
 

Scenario: Submit Lease form
Given I have opened Lease form
When I entered all details to Lease form
And I accept T&C of the Lease form
And I click to submit the Lease form
Then I get connected to PDP and see alert message of Lease form


Scenario: Submit quote form
Given I have opened quote form
When I entered all details to quote form
And I accept T&C of the quote form
And I click to submit the quote form
Then I get connected to PDP and see alert message of quote form


Scenario: Submit contact form from footer
Given I have opened contact form
When I entered all details to contact form
And I accept T&C of the contact form
And I click to submit the contact form
Then I get connected to customer service page and see message of contact form submitted successfully 


