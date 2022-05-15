@SmokeTesting
Feature: Search

  Background: user is logged in

    Given user had a valid registered account
      And open home page again

  Scenario: Guest User could search for any product using name

    # Search Steps
    When user click on search field
      And type "apple" in the search textBox
      And user click on search button

    Then user could find relative results


  Scenario: Guest User could search for any product using SKU

    # Search Steps
    When user click on search field
      And type "N_1020_LU" in the search textBox
      And user click on search button

    Then user could find "Nokia Lumia 1020"