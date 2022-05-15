@SmokeTesting
Feature: Add products to wishlist

  Background: user navigate to homepage

    Given open home page again
     And user navigates to home page

  Scenario: user could add products to wishlist

    Given user scroll down to products

    When user click on add to wishlist

    Then user select attributes for product if found
      And user should found the product added to wishlist in the wishlist