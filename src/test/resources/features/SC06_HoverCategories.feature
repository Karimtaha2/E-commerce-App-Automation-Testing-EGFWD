@SmokeTesting
Feature: Categories
  Select Different Categories

  Background: user navigate to homepage

    Given open home page again
      And user navigates to home page

  Scenario: Guest user could select different Categories

    Given user select random category

    Then user should redirected to the page of the selected category