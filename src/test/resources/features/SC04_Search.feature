@SmokeTesting
Feature: Search

  Background: user is logged in

    Given user had a valid registered account
      And open home page again

      # Login Steps again because a user logout
    When user clicked on Log in tab in the header website
      And user enter email address in login page
      And user enter password
      And user clicked on Log in button

    Then user should login successfully and see Log out tab in the header website

  Scenario: Logged User could search for any product

    # Search Steps
    When user click on search field
      And type "apple" in the search textBox
      And user click on search button

    Then user could find relative results