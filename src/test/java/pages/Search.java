package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class Search {
    public Search() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "search")
    public WebElement searchInput;

    @FindBy(css = "strong.product.name.product-item-name a")
    public WebElement searchResultItem;

    @FindBy(css = "div.product.attribute.sku > div.value")
    public WebElement productSKU;

    @FindBy(css = "div.message.notice")
    public WebElement noResultWarning;
}
