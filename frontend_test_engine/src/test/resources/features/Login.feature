Feature: Login

  Scenario: Login
    Given index page is open
    And credentials are entered
    When login button is pressed
    Then catalog page is opened