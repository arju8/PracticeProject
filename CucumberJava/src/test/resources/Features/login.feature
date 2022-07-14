#Author Arjunan
Feature: feature to test login functionality
@Smoketest
  Scenario: check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    Then user is navigated to the homepage

 
