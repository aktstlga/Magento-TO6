package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;
import utilities.ReusableMethods;

public class CartTransactions extends ReusableMethods {

    public CartTransactions() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Men']")
    public WebElement men;

    @FindBy(xpath = "//a[@title='Hero Hoodie']")
    public WebElement clothes;

    @FindBy(xpath = "//div[@option-label='S']")
    public WebElement size;

    @FindBy(id = "option-label-color-93-item-49")
    public WebElement color;

    @FindBy(xpath = "//input[@id='qty']")
    public WebElement qty;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public WebElement addbutton;

    @FindBy(xpath = "(//*[text()='Gear'])[1]")
    public WebElement gear;

    @FindBy(xpath = "//li[@class='level1 nav-4-1 category-item first ui-menu-item']/a/span")
    public WebElement bags;

    @FindBy(xpath = " //*[text()='Women']")
    public WebElement women;

    @FindBy(xpath = "(//*[text()='Tops'])[1]")
    public WebElement tops;

    @FindBy(xpath = "(//*[text()='Tees'])[1]")
    public WebElement tees;

    @FindBy(xpath = "//a[@class='logo']/img")
    public WebElement homepage;

    @FindBy(xpath = "(//*[text()='Tops'])[2]")
    public WebElement tops2;

    @FindBy(xpath = "(//*[text()='Jackets'])[2]")
    public WebElement jackets;

    @FindBy(xpath = "//*[text()='Training']")
    public WebElement training;

    @FindBy(xpath = "//*[text()='Video Download']")
    public WebElement video;
}