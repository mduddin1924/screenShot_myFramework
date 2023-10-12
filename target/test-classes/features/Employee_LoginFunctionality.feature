@Sanity005
Feature: EmployeeLoginFunctionality

  Description:
  As a Employee
  I Want to login as Employee
  So that I can see Employee Home Page


  Scenario: Verify Employee Login Functionality
    Given I See Landing Page
    Then I Press on Login Menu
    Then I click Employee Login Menu
    And I Enter Employee User Id
    And I Enter Employee Password
    When I click on Employee Login Button
    Then Verify I am In Employee Home Page
    And I Logout from Employee Home Page


    #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step





