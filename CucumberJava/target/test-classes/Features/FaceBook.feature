Feature: Test the facebook login functionality with POM and Data Driven

  Scenario Outline: Check with valid credentials in Facebook
    Given Open the browser
    And navigate to the webpage
    When i enter the valid <user1> and <pass1>
    And click the login button and enter homepage
    Then click the logout button

    Examples: 
      | user1     | pass1   |
      | dujv5928  | qwertyu |
      | 78slsk401 |   70371 |
