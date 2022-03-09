Feature: Login

  Scenario: Login
    Given index page is open
    And credentials are entered
    When login button is pressed
    Then inventory page is opened