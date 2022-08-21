Feature: Testing the Amazon search functionality

Scenario: verify whether user is able to search the mobile phone using the search box

Given user  landed on the amazon homepage
When user enters "Mobile phone 2022"
And user hits the search button
Then user should be displayed 20 items per page
