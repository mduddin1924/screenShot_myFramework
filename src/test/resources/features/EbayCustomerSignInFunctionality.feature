Feature: EbayCustomerSignInFunctionality
  Description:
  As a user
  I want to signIn as customer
  So that I can see the create an account page

  Background:
    Given I am in Ebay Landing Page
    Then I click on Ebay Register Menu
    Then I can see the signIn page

  Scenario: Verify Ebay Customer SignIn Functionality
    Then I enter details of my account creating information
      | md                  |
      | uddin               |
      | md@worldcup2023.com |
      | md123               |