@ggll
Feature:Google Search feature

  Scenario: Making sure is working as expected

    Given User is on the google homepage

    And user enters flovers
    And user click search button
    Then user should see result related to flower