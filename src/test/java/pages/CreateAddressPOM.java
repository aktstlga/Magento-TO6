package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class CreateAddressPOM {
    public CreateAddressPOM() {
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

    @FindBy(id = "zip")
    public WebElement selectCountry;
}
