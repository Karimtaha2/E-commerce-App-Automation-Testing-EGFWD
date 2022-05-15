@SmokeTesting
Feature: Switch between currencies

  Background: user navigate to homepage

    Given open home page again
      And user navigates to home page

  Scenario: Guest User  could switch between currencies US-Euro

    When user could select from currency dropdown list

    Then verify from currency
