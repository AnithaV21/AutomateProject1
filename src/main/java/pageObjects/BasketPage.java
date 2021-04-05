package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    public BasketPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"1\"]/td[2]/div/h3 ")
    public WebElement productInBasket;

    public void validateProductInBasket(String expectedProductInBasket)
    {
        Assert.assertEquals(productInBasket.getText(), expectedProductInBasket);

    }




}
