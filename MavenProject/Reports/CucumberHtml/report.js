$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Application",
  "description": "",
  "id": "adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username In The InputField",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In The InputField",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Searchpage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 19006579100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Username_In_The_InputField()"
});
formatter.result({
  "duration": 127387400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_The_InputField()"
});
formatter.result({
  "duration": 83195400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Searchpage()"
});
formatter.result({
  "duration": 2547489500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Search Functionality",
  "description": "",
  "id": "adactin-hotel-application;search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user Select the Location From The DropDown",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select the Hotel From DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The Room Type From DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The No Of Room From DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Chooses The Checkin Date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Chooses The Check OUt Date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Selects The Adult Per Room From DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Selects The Child Per Room From DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Clicks On The Search Button and Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_the_Location_From_The_DropDown()"
});
formatter.result({
  "duration": 177332700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_the_Hotel_From_DropDown()"
});
formatter.result({
  "duration": 159522000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type_From_DropDown()"
});
formatter.result({
  "duration": 136650700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_No_Of_Room_From_DropDown()"
});
formatter.result({
  "duration": 141388600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Chooses_The_Checkin_Date()"
});
formatter.result({
  "duration": 77107500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Chooses_The_Check_OUt_Date()"
});
formatter.result({
  "duration": 87785400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_The_Adult_Per_Room_From_DropDown()"
});
formatter.result({
  "duration": 162785300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_The_Child_Per_Room_From_DropDown()"
});
formatter.result({
  "duration": 133087100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_On_The_Search_Button_and_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 656732400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "adactin-hotel-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user Selects the Hotel By Clicking The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user Click On The Continue Button And Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Selects_the_Hotel_By_Clicking_The_Radio_Button()"
});
formatter.result({
  "duration": 65368300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_On_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 675595800,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Book Hotel Functionality",
  "description": "",
  "id": "adactin-hotel-application;book-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "user Enters The FirstName",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user Enters The LastName",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Enters The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enters The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Selects The Credit Card Type From",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Selects The Expiry Month From The DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enters The Expiry Year From The DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enters The Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Clicks On The Book Hotel Button And Navigates To LogOut Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_FirstName()"
});
formatter.result({
  "duration": 105529400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_LastName()"
});
formatter.result({
  "duration": 110515000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Billing_Address()"
});
formatter.result({
  "duration": 97801500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 104831200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_The_Credit_Card_Type_From()"
});
formatter.result({
  "duration": 149599300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Selects_The_Expiry_Month_From_The_DropDown()"
});
formatter.result({
  "duration": 145458200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Expiry_Year_From_The_DropDown()"
});
formatter.result({
  "duration": 133331700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Cvv_Number()"
});
formatter.result({
  "duration": 70233300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_On_The_Book_Hotel_Button_And_Navigates_To_LogOut_Page()"
});
formatter.result({
  "duration": 61585700,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "LogOut Functionality",
  "description": "",
  "id": "adactin-hotel-application;logout-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "user Clicks ON The LogOut Button",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user Should LogOUt SuccessFully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Clicks_ON_The_LogOut_Button()"
});
formatter.result({
  "duration": 382311400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Should_LogOUt_SuccessFully()"
});
formatter.result({
  "duration": 99900,
  "status": "passed"
});
});