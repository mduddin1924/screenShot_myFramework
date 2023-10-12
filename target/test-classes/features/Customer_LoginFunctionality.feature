@Customer
Feature: CustomerLoginFunctionality

  Description:
  As a Customer
  I Want to login as Customer
  So that I can see Customer Home Page


  Scenario Outline: Verify Customer Login Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    Then I click on Customer Login Menu
    Then I Enter Customer User Id "<userId>"
    Then I Enter Customer User Password "<password>"
    When I click on Customer Login Button
    Then I can see the "<user>" "<message>"


  Examples:
    | userId           | password | user | message                       |
    | david@gmail.com  | 1234     | 01   | Welcome David                 |
    | sharif@gmail.com | 2222     | 02   | Invalid username or password! |
    | david@gmail.com  | 3333     | 03   | Invalid username or password! |
    | arif@gmail.com   | 1234     | 04   | Invalid username or password! |





      #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step




