@Amazon
Feature: Test Amazon search functionality

    @Cart
    Scenario Outline: As a customer when i search for Alexa, i want to see id the third option on the second page is avaliable for purchase and can be added to the cart.
    Given The user navigates to www.amazon.com
    When Searches for <Product>
    And navigates to the page number 2
    And selects the third item
    Then The user is able to add it to the cart

    Examples: 
            |Product       |
            |Alexa         |
            |playstation   |
