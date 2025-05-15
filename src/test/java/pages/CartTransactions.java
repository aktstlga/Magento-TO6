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

    @FindBy(xpath = "(//li[@class='authorization-link'])[1]/a")
    public WebElement singın;

    @FindBy(xpath = " //input[@name='login[username]']")
    public WebElement email;

    @FindBy(xpath = " //input[@name='login[password]']")
    public WebElement password;

    @FindBy(xpath = " (//div[@class='primary'])[1]/button")
    public WebElement sıgnınbutton;

    @FindBy(xpath = "//*[text()='Men']")
    public WebElement men;

    @FindBy(xpath = "//a[@title='Hero Hoodie']")
    public WebElement clothes;

    @FindBy(xpath = "(//*[text()='S'])[1]")
    public WebElement size;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    public WebElement color;

    @FindBy(xpath = "(//div[@class='control'])[2]/input")
    public WebElement qty;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public WebElement addbutton;
}
