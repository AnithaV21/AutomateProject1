Feature: Menu Test
  As a user
  I should be re-directed appropriately

  @menu

  Scenario Outline: Validate the Menu and Submenu re-direction

    Given I am on Homepage "http://www.next.co.uk"
    When I mouseover menu "<menu>"
    And I click submenu "<submenu>"
    Then I should be re-directed to appropriate product lists page with title as "<productsListsTitle> "

    Examples:
    |menu| submenu| productsListsTitle|

    |MEN   | Shirts   |  Shirts    |
    |WOMEN | Dresses  |  Dresses        |
    | BOYS | Knitwear | Boys Knitwear   |