@Textbox
Feature:Textbox scenarios of DEMOQA Site
  Scenario: User Textbox on DEMOQA Site
    Given User is on Elements
    When User fill the data
      |fill_data|
    And User clicks on submit button
    Then User should be fill data  Successfully

