Feature: Payment Test

  As a user
  I should be able to process payment

  @payment
  Scenario: Validate Payment

    Given I am on Homepage "http://www.next.co.uk"
    When I search for a product "Jumpers"
    And I choose a product "Navy Sequined Jumper"
    And I choose Size " 8 "
    And I click add to bag button
    