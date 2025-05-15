package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class ProductOrderingPOM {
    public ProductOrderingPOM() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "button#product-addtocart-button")
    public WebElement addToCartButton;

    @FindBy(css = "a.action.showcart")
    public WebElement cartIcon;

    @FindBy(css = "a.action.viewcart")
    public WebElement viewCartButton;

    @FindBy(css = "button[title='Proceed to Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(id = "company")
    public WebElement companyNameField;

    @FindBy(id = "telephone")
    public WebElement phoneField;

    @FindBy(id = "street_1")
    public WebElement streetField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "country")
    public WebElement selectCountryDropdown;

    @FindBy(id = "zip")
    public WebElement zipCodeField;

    @FindBy(css = "button[data-action='save-address']")
    public WebElement saveAddressButton;

    @FindBy(css = "button.continue")
    public WebElement nextToPaymentButton;

    @FindBy(css = "tr.item")
    public List<WebElement> shippingMethods;

    @FindBy(css = "input[name='billing-address-same-as-shipping']")
    public WebElement billingSameAsShippingChecked;

    @FindBy(css = "button[title='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(css = ".checkout-success p span")
    public WebElement orderNumber;

    @FindBy(css = ".checkout-success p")
    public WebElement successMessage;
}
