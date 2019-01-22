@googleParameters
Feature: Google search functionality

  Scenario: Testing google search
    Given User is on the homepage of google
    When User enters "flowers"
    Then User should see "flowers" in the title