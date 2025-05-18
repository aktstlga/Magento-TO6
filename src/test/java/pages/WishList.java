package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class WishList {

    public WishList() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "search")
    public WebElement searchInput;

    @FindBy(css = "button[title='Search']")
    public WebElement searchButton;

    @FindBy(css = "img[alt='Lando Gym Jacket']")
    public WebElement productImage;

    @FindBy(xpath = "//span[text()='Add to Wish List']")
    public WebElement addToWishListButton;

    @FindBy(xpath = "//div[@class='message-success success message']//div")
    public WebElement wishListSuccessMessage;

    @FindBy(xpath = "//a[@title='Remove Item']")
    public WebElement removeItemButton;

    @FindBy(xpath = "//div[@class='message-success success message']//div[contains(text(),'has been removed from your Wish List')]")
    public WebElement removeSuccessMessage;

}