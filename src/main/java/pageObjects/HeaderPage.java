package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

    public  static WebDriver driver;
    public static String menu ;

    public HeaderPage(WebDriver driver)
    {
        PageFactory.initElements(driver , this);
        this.driver = driver;
    }

    @FindBy(id ="sli_search_1")
    public WebElement searchTextField;

    @FindBy(xpath = "//*[@id=\"newsearch\"]/input[4]")
    public WebElement searchIcon;

    public void enterSearchTerm(String searchTerm)

    {
        searchTextField.sendKeys(searchTerm);
    }

    public void clickSearchIcon()

    {
        searchIcon.click();
    }


    public static void mouseOverMenu(String menuOption)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[text() ='"+menuOption+"']"))).build().perform();
        menu = menuOption;

    }

    public void chooseSubMenu(String subMenuOptions)

    {
        driver.findElement(By.xpath("//li[@data-department='"+menu+"']/div/div/ul/li/div/a[text()='"+subMenuOptions+"']")).click();
    }






}