Feature: To verify the Login functionality on the Laserhub Application 

  Background: 
    Given I launch Chrome Browser

  Scenario: Login to Application
    Given user is on Login page
    When User Enter UserName
    And User Enter Password
    And User click on login button
    Then I should see ChooseAccount Screen
    When User click on ChooseAccount Radio Button
    And User click on Continue Button
    Then I should see Setup Account Screen