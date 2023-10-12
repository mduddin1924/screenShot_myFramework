@Customer
Feature: CustomerOrderFunctionality

  Description:
  As a Customer
  I Want to login as Customer
  So that I can see Customer Home Page And Product Order Menu


  Scenario: Verify Customer Order Functionality
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter Customer User Id
    And I Enter Customer User Password
    When I click on Customer Login Button
    Then Verify I am In Customer Home Page
    When I Click on Customer order Product Menu
    Then I Use Customer Product Name
    Then I Enter Customer order date
    Then I Click Customer Order Product Button
    When I Click Confirm Customer Product
    And I Confirmed Customer Product
    And I logout From Customer Order List



     #Gherkin Language -
#which has few keywords ie. Feature, Scenario, Given, When, Then, And, *
#Given - Precondition
#called Test Step