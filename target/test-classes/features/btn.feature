@my
Feature: check radio button
  Background: user on a home page
    Given go to "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton"
    And  verify title "Radio Button"
    Scenario: one
      Then verify that Football is selected by default
    And  all others are not selected

      Scenario: two
        Then Select a random sport
        And verify that all other options are not selected