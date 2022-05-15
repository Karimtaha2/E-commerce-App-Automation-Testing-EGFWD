@SmokeTesting
Feature: Follow Us

  Background: user navigate to homepage

    Given open home page again
      And user navigates to home page

  Scenario: Confirm "Follow us" links open the corresponding websites

    Given user scroll down

    When user clicked on icons link

    Then user can switch between pages
