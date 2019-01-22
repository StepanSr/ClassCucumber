
@OUT_Scenario
Feature: Testing datatables website
  Scenario Outline: Testing adding new employee to the table

    Given User is on the datatables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter firstname "<firstname>"
    And User should enter lastname "<lastname>"
    And User should enter position "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extension>"
    And User should enter start date "<date>"
    And User should enter salary "<salary>"
    Then User should click to create button
    And User enters first name "<firstname>" to search box
    Then User should see first name is inserted in the table "<firstname>"


    Examples:  Test data for datatables



    |firstname|lastname|position|office|extension|date    |salary|
    |john      |doe     |slave   |Chicago|123     |2019-01-12|1234|
#    |Sonya     |Ru      |quin    |Zhytomyr|11     |2019-11-11|1000000|
#    |Maks      |Ty      |        |        |       |          |       |
#    |    Max   |  Smith  |        |        |       |          |       |
#