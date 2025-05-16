package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.ProductOrderingPOM;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class ProductOrdering {
    ProductOrderingPOM page = new ProductOrderingPOM();
    ReusableMethods reusableMethods = new ReusableMethods();

    @When("The user adds a random product to the cart")
    public void theUserAddsRandomProductToCart() throws InterruptedException {
        List<WebElement> products = GWD.getDriver().findElements(By.cssSelector("a.product-item-link"));
        reusableMethods.clickRandomElement(products);
        reusableMethods.waitForElementToBeClickable(page.addToCartButton);
        page.addToCartButton.click();
        reusableMethods.wait(2);
        page.cartIcon.click();
        reusableMethods.wait(1);
        page.viewCartButton.click();
        page.proceedToCheckoutButton.click();
    }

    @When("The user fills in the shipping address:")
    public void theUserFillsShippingAddress(DataTable table) throws InterruptedException {
        Map<String, String> data = table.asMaps().get(0);
        reusableMethods.wait(2);
        reusableMethods.mySendKeys(page.companyNameField, data.get("company"));
        reusableMethods.mySendKeys(page.phoneField, data.get("phoneNumber"));
        reusableMethods.mySendKeys(page.streetField, data.get("street"));
        reusableMethods.mySendKeys(page.cityField, data.get("city"));
        reusableMethods.mySendKeys(page.zipCodeField, data.get("zipCode"));

        reusableMethods.mySelect(page.selectCountryDropdown);
    }

    @When("The user saves the address and continues")
    public void theUserSavesAddressAndContinues() throws InterruptedException {
        reusableMethods.myClick(page.saveAddressButton);
        reusableMethods.wait(1);
        reusableMethods.myClick(page.nextToPaymentButton);
    }

    @When("The user selects a shipping method and proceeds to payment")
    public void theUserSelectsShippingMethodAndProceeds() throws InterruptedException {
        if (!page.shippingMethods.isEmpty()) {
            page.shippingMethods.get(0).click();
        }
        reusableMethods.wait(1);
        reusableMethods.myClick(page.nextToPaymentButton);
    }

    @When("The user confirms billing address and places the order")
    public void theUserConfirmsBillingAndPlacesOrder() {
        Assert.assertTrue(page.billingSameAsShippingChecked.isSelected());
        reusableMethods.myClick(page.placeOrderButton);
    }

    @Then("The user should see a success message and order number")
    public void theUserShouldSeeSuccessMessage() {
        Assert.assertTrue(page.successMessage.isDisplayed());
        Assert.assertTrue(page.orderNumber.isDisplayed());
        System.out.println("Order Number: " + page.orderNumber.getText());
    }
}