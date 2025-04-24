Feature: Login test cases for Naukari Login application

Scenario: Login with valid username and valid password
Given user clicks on firstLogin button
And  user enters valid username
And user enters valid password
And user clicks on login button
Then Home page should be displayed

Scenario: Validate Home page

Given user clicks on profilepic
And user clicks on view and update profile
And user clicks on update resume button
Then upload successfully should be displayed
And click on logout