@some
Feature: Amazon search
  @amazon_search
  Scenario: Amazon search test
    Given User is on the amazon page
    When User enters headphones keyword
    And user click to search btn
    Then  User should see headphones in result
