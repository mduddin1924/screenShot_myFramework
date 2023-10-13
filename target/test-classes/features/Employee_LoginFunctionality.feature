@Sanity
Feature: EmployeeLoginFunctionality

  Description:
  As a Employee
  I Want to login as Employee
  So that I can see Employee Home Page


  Scenario Outline: Verify Employee Login Functionality
    Given I See Landing Page
    Then I Press on Login Menu
    Then I click Employee Login Menu
    And I Enter Employee User Id "<userId>"
    And I Enter Employee Password "<password>"
    When I click on Employee Login Button
    Then I can see employee "<number>" and "<message>"

    Examples:
      | userId              | password | number | message          |
      | testpilot@gmail.com | 1234     | 01     | Employee Id: 102 |


    #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step





