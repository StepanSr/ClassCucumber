@days
  Feature: Week Days
    Scenario: check weekdays

      Given open browser go to "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox"
    Then Randomly select days of the week.
    And  print the name of the day and uncheck immediately.
