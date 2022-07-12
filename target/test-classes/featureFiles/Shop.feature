
@BuyDress
Feature: Buying a Blouse
  As a user  I should be able to buy the product of my preference.
  
  @validCredentials
  Scenario: As a normal user I should be able to log in with valid credentials and buy a blouse
    Given The user enter to login page
    When The user enter username as "TM1978@gmail.com"
    And The user enter password as "Pipeta24"
    And The user click on the sign in botton
    And The user go to home page
    #And The user select blouse image
    #And The user clear the information load in the page
    #And The user fill the box quantity 
    #And the user select the size
    #And The user select color black
    And The user click add to cart botton
    And The user click on first proceed to checkout botton
    And The user go to the shopping cart summary page
    And The user click on second proceed to checkout button
    And The user go to the addresses page
    And The user click on third proceed to checkout button
    And The user go to the shipping page
    And The user click on accepting terms of service square
    And The user click on fourth proceed to check out
    And The user go to please choose your payment method page
    And The user click on pay by bank wire bar
    And The user click on confirm my order button
    Then The user should see the orden confirmation