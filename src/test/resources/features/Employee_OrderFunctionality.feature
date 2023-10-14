@Employee
Feature: EmployeeOrderFunctionality

  Description:
  As a Employee
  I Want to login as Employee
  So that I can see Employee Home Page and Product Order Menu


  Scenario Outline: Verify Employee Order Functionality
    Given I See Landing Page
    Then I Press on Login Menu
    Then I click Employee Login Menu
    And I Enter Employee User Id "<userId>"
    And I Enter Employee Password "<passCode>"
    When I click on Employee Login Button
    Then I can see employee "<number>" and "<message>"
    Then I click Employee Product Order Menu
    When I Choose Employee Product Name
    Then I Put Employee Order Date
    Then I click Employee Order Product Button
    When I confirm Employee Order Product
    Then I confirmed Employee Order Product
    And I logout From Employee Order List

    Examples:
      | userId              | passCode | number | message          |
      | testpilot@gmail.com | 1234     | 01     | Employee Id: 102 |


     #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step








