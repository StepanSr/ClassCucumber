@some
Feature: Wikipedia search feature

  @w
  Scenario: Wikipedia search test

    Given User is on the wicipedia homepage
    When user enter Stive Jobs to search bar and click enter
    Then User sould see the first header is displaing steve jobs
