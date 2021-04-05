package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.BasketPage;
import pageObjects.HeaderPage;
import pageObjects.ProductsDetailsPage;
import pageObjects.SearchResultsPage;

public class BasketSteps extends CommonFunctions

{
    HeaderPage headerPage = new HeaderPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
    ProductsDetailsPage productsDetailsPage = new ProductsDetailsPage(driver);
    BasketPage basketPage = new BasketPage(driver);



    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String searchTerm)
    {
        headerPage.enterSearchTerm(searchTerm);
        headerPage.clickSearchIcon();
    }

    @When("^I choose a product \"([^\"]*)\"$")
    public void i_choose_a_product(String product)
    {
      searchResultsPage.chooseProduct();

    }

    @When("^I choose Size \"([^\"]*)\"$")
    public void i_choose_Size(String size)
    {
        productsDetailsPage.chooseSize(size);

    }

    @When("^I click add to bag button$")
    public void i_click_add_to_bag_button()
    {
        productsDetailsPage.clickAddToBagButton();

    }

    @Then("^I should see the same product in the bag \"([^\"]*)\"$")
    public void i_should_see_the_same_product_in_the_bag(String expectedProductInBasket)
    {
       basketPage.validateProductInBasket(expectedProductInBasket);

    }



}
