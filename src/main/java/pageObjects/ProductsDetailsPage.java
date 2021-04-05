package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsDetailsPage
{

    public ProductsDetailsPage(WebDriver driver)

    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"dk_container_Size-194-643\"]/a")
    public WebElement sizeDropDown;

    @FindBy(xpath = "//*[@id=\"Style551926\"]/section/div[5]/div[6]/div[4]/div/a[1]")
    public WebElement addToBagButton;

    public void chooseSize(String size)
    {
        new Select(sizeDropDown).selectByValue("8");

    }
    public void clickAddToBagButton()
    {
      addToBagButton.click();
    }



}
