@Employee
Feature: EmployeeOrderFunctionality

  Description:
  As a Employee
  I Want to login as Employee
  So that I can see Employee Home Page and Product Order Menu



  Scenario: Verify Employee Order Functionality
    Given I am in Landing Page
    Then I Press on Login Menu
    Then I click Employee Login Menu
    Then I Enter Employee User Id
    Then I Enter Employee Password
    When I click on Employee Login Button
    Then Verify I am In Employee Home Page
    Then I click Employee Product Order Menu
    When I Choose Employee Product Name
    Then I Put Employee Order Date
    Then I click Employee Order Product Button
    When I confirm Employee Order Product
    Then I confirmed Employee Order Product
    And I logout From Employee Order List


     #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step








