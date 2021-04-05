Feature: Search Test

  As a user
  I should search and get relevant results

  @search
  Scenario: validate search with valid search Term

    Given I am on Homepage "http:// www.next.co.uk"
    When I enter searchTerm "Jumpers"
    And I click searchIcon
    Then I should get relevant results with results heading as "Jumpers"





