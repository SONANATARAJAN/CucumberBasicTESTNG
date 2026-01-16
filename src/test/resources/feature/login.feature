Feature: Login

  Scenario: Valid login
    Given user opens browser
    When user enters credentials
    Then login should be successful
