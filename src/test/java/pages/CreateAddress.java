package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class CreateAddress {

    public CreateAddress() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Address Book")
    public WebElement addressBookButton;

    @FindBy(id = "company")
    public WebElement companyNamePlaceholder;

    @FindBy(id = "telephone")
    public WebElement telephoneNumberPlaceholder;

    @FindBy(id = "street_1")
    public WebElement streetAddressOne;

    @FindBy(id = "city")
    public WebElement cityNamePlaceholder;

    @FindBy(id = "region_id")
    public WebElement selectState;

    @FindBy(id = "country")
    public WebElement selectCountry;

    @FindBy(id = "zip")
    public WebElement zipCode;


    @FindBy(id = "region")
    public WebElement stateSendKeys;

    @FindBy(css = "button[type='submit'][data-action='save-address']")
    public WebElement saveAddressButton;

    @FindBy(css = "div[data-ui-id='message-success'] > *:nth-child(1)")
    public WebElement successText;

    @FindBy(css = "button[title='Add New Address']")
    public WebElement addAddressButton;

    @FindBy(css = "a[class='logo'] > *:nth-child(1)")
    public WebElement mainPageButton;

    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
    public WebElement myAccountButton;

    @FindBy(linkText = "My Account")
    public WebElement myAccountNavigationButton;
}
