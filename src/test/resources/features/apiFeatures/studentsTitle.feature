
Feature: Student Title API Automation
  @titleStudent
  Scenario: Titles Students  validation
    When user hits all student API with "http://www.cybertekchicago.com/student/all"
    Then user tests for required title not empty and more than 2 Char

    @emailStudet
    Scenario: Email Students  validation
      When user hits all student API with "http://www.cybertekchicago.com/student/all"
      Then email should contain dot and at characters