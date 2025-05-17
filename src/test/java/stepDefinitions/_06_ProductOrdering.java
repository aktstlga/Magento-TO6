package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.ProductOrdering;
import utilities.GWD;
import utilities.ReusableMethods;

import java.time.Duration;

public class _06_ProductOrdering {

    ProductOrdering p = new ProductOrdering();
    ReusableMethods r = new ReusableMethods();

    @And("User selects a product from Men's section and adds it to the cart")
    public void selectAndAddProduct() {
        r.myClick(p.menMenu);
        r.myClick(p.product);
        r.myClick(p.size);
        r.myClick(p.color);
        p.quantity.clear();
        r.mySendKeys(p.quantity, "1");
        r.myClick(p.addToCart);
        r.Wait(2);
        r.myClick(p.cartButton);
        r.myClick(p.proceedToCheckout);
    }

    @And("User proceeds to checkout")
    public void proceedToCheckout() {
        r.Wait(2);
    }

    @And("User confirms default address and selects shipping method")
    public void confirmDefaultAddressAndChooseShipping() {
        try {
            r.WaitUntilVisible(p.flatRateShippingRadio);
            r.clickWithJS(p.flatRateShippingRadio);
            r.WaitUntilVisible(p.nextButton);
            r.myClick(p.nextButton);
        } catch (Exception e) {
            System.out.println("Shipping method or next button could not be interacted with.");
        }
    }

    @And("User selects payment method and places the order")
    public void placeOrder() {
        r.Wait(3);
        r.myClick(p.placeOrderButton);
    }

    @Then("Order should be placed successfully")
    public void orderSuccess() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));
        WebElement successContainer = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.checkout-success"))
        );
        Assert.assertTrue(successContainer.isDisplayed(), "Checkout success container is not visible!");
    }
}
