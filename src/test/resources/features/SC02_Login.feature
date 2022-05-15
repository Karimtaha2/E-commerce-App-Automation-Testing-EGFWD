@SmokeTesting
Feature: Login Page

  Scenario: User could log in with valid email and password

    Given user had a valid registered account
      And user navigates to home page

    When user clicked on Log in tab in the header website
      And user enter email address in login page
      And user enter password
      And user clicked on Log in button

    Then user should login successfully
      And user clicked on Log out tab
