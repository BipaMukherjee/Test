Feature: Create Account Functionality

Scenario: Verify the functionality with valid credentials
Given I am on Create Account page
When I enters valid credentials
|First Name|Sahadat|
|Last Name|Dipu|
|email address|kahon_13@yahoo.com|
|password|Dipu1234|
|confirm password|Dipu1234|
And I select gender
And select Date of birth
And write phone number
|Phone Number|07401637333|
And I select Main goal
And I select COUNT ME redio button
And I Click JOIN IN
Then It Should direct me My account page  