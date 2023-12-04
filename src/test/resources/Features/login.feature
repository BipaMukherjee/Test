@smoke
@regression
Feature: login functionality

  Scenario: login with valid credentials
    Given user is in login page
    When user enters correct login credentials
    And clicks on login button
    Then user gets logged in
    And lands to my account page
    

    
    
    Scenario: login with invalid credentials
    Given user is in login page
    When user enters incorrect login credentials
    And clicks on login button
    Then user gets error message
 