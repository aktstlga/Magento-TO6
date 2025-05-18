package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class Login {

    public Login() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "div[class='panel header'] li[data-label='or'] a")
    public WebElement signInButtonOnMainPage;

    @FindBy(id = "email")
    public WebElement emailPlaceholder;

    @FindBy(id = "pass")
    public WebElement passwordPlaceholder;

    @FindBy(id = "send2")
    public WebElement loginClickButton;

    @FindBy(xpath = "(//span[@class='logged-in'])[1]")
    public  WebElement welcomeMesseageText;

    @FindBy(css = "div[class='panel header'] button[type='button']")
    public WebElement openSectionsMenu;

    @FindBy(css = "div[aria-hidden='false'] li[data-label='or'] a")
    public WebElement signOutButton;
}