@SmokeTesting
Feature: Registration Page
  Create new account

  Scenario: Guest user could register with valid data successfully

    Given user navigates to home page

    When user clicked on Register tab
      And user select gender "Male"
      And user enter first name "testFirst"
      And user enter last name "testLast"
      And user selected birth of date "5/7/2007"
      And user enter email address
      And user enter company name "Utest"
      And user select Newsletter option "True"
      And user enter password
      And user enter confirm password
      And user clicked on REGISTER button

    Then user should see "Your registration completed" message
      And user should login successfully and see Log out tab in the header website
      And user clicked on Log out tab