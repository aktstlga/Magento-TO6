package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class ProductOrdering {

    public ProductOrdering() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Men']")
    public WebElement menMenu;

    @FindBy(xpath = "//a[@title='Hero Hoodie']")
    public WebElement product;

    @FindBy(xpath = "//div[@option-label='S']")
    public WebElement size;

    @FindBy(id = "option-label-color-93-item-49")
    public WebElement color;

    @FindBy(xpath = "//input[@id='qty']")
    public WebElement quantity;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCart;

    @FindBy(css = "a.action.showcart")
    public WebElement cartButton;

    @FindBy(id = "top-cart-btn-checkout")
    public WebElement proceedToCheckout;

    @FindBy(css = "input[value='flatrate_flatrate']")
    public WebElement flatRateShippingRadio;

    @FindBy(css = "button.continue")
    public WebElement nextButton;

    @FindBy(css = "button[title='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(css = "div.checkout-success")
    public WebElement orderSuccess;
}
