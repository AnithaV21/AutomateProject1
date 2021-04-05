package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.HeaderPage;
import pageObjects.SearchResultsPage;

public class MenuSteps extends CommonFunctions {

    HeaderPage headerPage = new HeaderPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);


    @When("^I mouseover menu \"([^\"]*)\"$")
    public void i_mouseover_menu(String menuOption)
    {
       headerPage.mouseOverMenu(menuOption);


    }

    @When("^I click submenu \"([^\"]*)\"$")
    public void i_click_submenu(String subMenuOptions)
    {
        implicitWait(3);
        headerPage.chooseSubMenu(subMenuOptions);


    }

    @Then("^I should be re-directed to appropriate product lists page with title as \"([^\"]*)\"$")
    public void i_should_be_re_directed_to_appropriate_product_lists_page_with_title_as(String productsListsTitle )
    {
        searchResultsPage.validateProductsResultsTitle(productsListsTitle);

    }


}
