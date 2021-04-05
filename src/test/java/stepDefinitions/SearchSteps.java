package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.HeaderPage;
import pageObjects.SearchResultsPage;


public class SearchSteps extends CommonFunctions {

    HeaderPage headerPage = new HeaderPage(driver);
    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);



    @Given("^I am on Homepage \"([^\"]*)\"$")
    public void i_am_on_Homepage(String url)
    {
       driver.get("http://www.next.co.uk");
    }

    @When("^I enter searchTerm \"([^\"]*)\"$")
    public void i_enter_searchTerm(String searchTerm)
    {
       headerPage.enterSearchTerm(searchTerm);
    }


    @When("^I click searchIcon$")
    public void i_click_searchIcon()

    {
        headerPage.clickSearchIcon();

    }

    @Then("^I should get relevant results with results heading as \"([^\"]*)\"$")
    public void i_should_get_relevant_results_with_results_heading_as(String expectedResultsHeading)
    {
        searchResultsPage.validateSearch(expectedResultsHeading);

    }

}
