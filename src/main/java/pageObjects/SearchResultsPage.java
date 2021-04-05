package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

    public WebDriver driver;


    public SearchResultsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"ResultHeader\"]/div[1]/h1/div")
    public WebElement expectedResultsHeading;


    public void validateSearch (String actualResultsHeading)
    {
        Assert.assertEquals(actualResultsHeading, expectedResultsHeading.getText());

    }
    @FindBy(xpath= "//*[@id=\"i1\"]/section/div[2]/a/img")
    public WebElement productLink;



    public void chooseProduct()
    {
        productLink.click();
    }
    public void validateProductsResultsTitle(String productsResultsTitle)
    {
        String actualProductsResultsTitle = driver.findElement(By.xpath("//h1[contains(text(),'"+productsResultsTitle+"')]" )).getText();
        Assert.assertEquals(productsResultsTitle,actualProductsResultsTitle);

    }
}
