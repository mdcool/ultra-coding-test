Feature: Login

  Background: Open the website
    Given website is open

  Scenario: Login
    Given credentials are entered
    When login button is pressed
    Then inventory page is opened

  Scenario: Purchase
    Given user is logged in
    And user has a product in cart
    When user proceeds with checkout
    Then user is able to place the order