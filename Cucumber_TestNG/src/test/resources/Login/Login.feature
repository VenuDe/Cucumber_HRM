Feature: Login feature of a OrganeHRM
Scenario: Validate Login
    Given I should be in the Login page of OrangeHRM
    When Enter Username "Admin"
    And Enter Password "admin123"
    And Click on LoginButton
    Then Login Successfull message 
    Then close

