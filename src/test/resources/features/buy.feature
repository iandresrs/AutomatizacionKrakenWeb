#language:en
  Feature: Buy
   Background:
     Given That the user is on the page

     Scenario: Buy laptop
      When The user logs in
       And The user makes the purchase
       Then The user can validate that the purchase has been successful.