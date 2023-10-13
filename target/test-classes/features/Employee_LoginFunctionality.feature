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
    And I Enter Employee Password "<passCode>"
    When I click on Employee Login Button
    Then I can see employee "<number>" and "<message>"

    Examples:
      | userId                  | passCode | number | message                       |
      | testpilot@gmail.com     | 1234     | 01     | Employee Id: 102              |
      | southAfrica@hotmail.com | 3856     | 02     | Invalid username or password! |
      | newZealand@yahoo.com    | 0990     | 03     | Invalid username or password! |
      | pakistan@worldCup.com   | 1992     | 04     | Invalid username or password! |

    #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step





