Feature: Basket Test
  As a user
  I should be able to add/edit/delete products in the basket

  @basket @smoke @regression

  Scenario: validating adding products to basket

    Given I am on Homepage "http://www.next.co.uk"
    When I search for a product "Jumpers"
    And I choose a product "Navy Sequined Jumper"
    And I choose Size " 8 "
    And I click add to bag button
    Then I should see the same product in the bag "Navy Sequined Jumper"








