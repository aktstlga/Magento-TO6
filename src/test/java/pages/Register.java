package pages;

import utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;

public class Register extends ReusableMethods {

    public Register() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Create an Account")
    public WebElement account;

    @FindBy(css = "input[name='firstname']")
    public WebElement firstName;

    @FindBy(css = "input[name='lastname']")
    public WebElement lastName;

    @FindBy(css = "input[name='email']")
    public WebElement eMail;

    @FindBy(css = "input[name='password']")
    public WebElement password;

    @FindBy(css = "input[name='password_confirmation']")
    public WebElement confingPassword;

    @FindBy(css = "button[class='action submit primary']")
    public WebElement accountButton;

}
