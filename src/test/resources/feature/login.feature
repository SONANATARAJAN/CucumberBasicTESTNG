Feature: Login

  Scenario Outline: Valid login
    Given user opens browser
    When user enters credentials "<firstname>" and "<surname>"
    Then login should be successful

    Examples:
      | firstname | surname |
      | sona      | Sona N  |





