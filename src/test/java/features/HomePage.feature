Feature: Test the functionality on the SPA


  Scenario: Discard the new deal
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click new deal button
    And   I enter the dealname as "Apple"
    And   I click the discard button



  Scenario: Create a new deal
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click new deal button
    And   I enter the dealname as "Apple"
    And   I select the CPRI Team
    #And   I click the discard button