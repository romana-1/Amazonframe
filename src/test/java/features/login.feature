Feature: login feature

Background:
Given user in Amazon Homepage
And user click on Account & List



 Scenario: User should be able to login with valid email and valid password
  And user enter valid email address
  And user click on continue button
  And user enter valid password
  When user clicks on sign in button
  Then the user should be able to login successfully
