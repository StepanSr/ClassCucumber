Feature: Single Student API Automation
  @singleStudent
  Scenario: Single Student Attribute validation
    When user hits single student API with "http://www.cybertekchicago.com/student/88"
    Then user tests for required attributes