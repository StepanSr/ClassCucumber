Feature: This is my first Feature

    @smoke
  Scenario: Google search scenario
    When user goes to Google application
    Then user searches for apple
    And user should see apple related results