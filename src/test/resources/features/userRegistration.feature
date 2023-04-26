#language:en
  Feature: : user registration
    Scenario: Successful user registration
      Given the user is on the website
      When the user clicks on create new account button
      And the user fills in the form with his data
      Then the user will be able to validate his user name