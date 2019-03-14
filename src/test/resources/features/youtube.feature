@funny_cat
Feature: Youtube search feature

  Background:  User is on the home page
    Given User is on the youtube page
    And User is able to see the search box
    And User is able to see search button

  Scenario: Testing youtube search

    When User searches for Funny Cat Videos
    Then User should see result related to funy cat videos


  Scenario: Testing youtube search1

    When User searches for Funny Dog Videos
    Then User should see result related to funy Dog videos


  Scenario: Testing youtube search2

    When User searches for Funny Sofia Videos
    Then User should see result related to funy Sofia videos
