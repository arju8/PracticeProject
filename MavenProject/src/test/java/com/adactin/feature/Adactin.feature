Feature: Adactin Hotel Application
Scenario: Login Functionality
Given user Launch The Adactin Application
When user Enter The Username In The InputField
And user Enter The Password In The InputField
Then user Click On The Login Button And It Navigates To The Searchpage

Scenario: Search Functionality
When user Select the Location From The DropDown
And user Select the Hotel From DropDown
And user Select The Room Type From DropDown
And user Select The No Of Room From DropDown
And user Chooses The Checkin Date
And user Chooses The Check OUt Date
And user Selects The Adult Per Room From DropDown
And user Selects The Child Per Room From DropDown
Then user Clicks On The Search Button and Navigates To Select Hotel Page


Scenario: Select Hotel Functionality
When user Selects the Hotel By Clicking The Radio Button
Then user Click On The Continue Button And Navigates To Book A Hotel Page

Scenario: Book Hotel Functionality
When user Enters The FirstName
And user Enters The LastName
And user Enters The Billing Address
And user Enters The Credit Card Number
And user Selects The Credit Card Type From
And user Selects The Expiry Month From The DropDown
And user Enters The Expiry Year From The DropDown
And user Enters The Cvv Number
Then user Clicks On The Book Hotel Button And Navigates To LogOut Page

Scenario: LogOut Functionality
When user Clicks ON The LogOut Button
Then user Should LogOUt SuccessFully

