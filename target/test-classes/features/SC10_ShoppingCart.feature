@SmokeTesting
Feature: Shopping Cart

  Background: user navigate to homepage

    Given open home page again
      And user navigates to home page

  Scenario: User choose a product and click on ADD TO CART button

    Given user scroll down to products
      And user select a random product

    When Click on ADD TO CART button

    Then the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart
