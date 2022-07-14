Feature: check the login functionality

  Scenario Outline: check login with incorrect credentials
    Given open the browser
    And navigate to the page
    When i enter the <username> and <password>
    And click on the login button
    Then we can see the error page

    Examples: 
      | username | password |
      | arj1     |      123 |
      | arj2     |     1234 |
