package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class LoginPOM {
    public LoginPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Sign In']")
    public WebElement signInButtonOnMainPage;

    @FindBy(id = "email")
    public WebElement emailPlaceholder;

    @FindBy(id = "pass")
    public WebElement passwordPlaceholder;

    @FindBy(id = "send2")
    public WebElement loginClickButton;
}
