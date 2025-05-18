package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WishList;
import utilities.GWD;
import utilities.ReusableMethods;

import java.time.Duration;

public class _08_WishList extends ReusableMethods {
    ReusableMethods rm = new ReusableMethods();
    WishList wishList = new WishList();

    @When("The user enters {string} into the search box and clicks the search icon")
    public void theUserSearchesForTheProduct(String sku) {
        mySendKeys(wishList.searchInput, sku);
        myClick(wishList.searchButton);
    }

    @And("The user clicks on the product image of {string}")
    public void theUserClicksOnTheProductImage(String productName) {
        myClick(wishList.productImage);
    }

    @And("The user adds the product to the wish list")
    public void theUserAddsProductToWishList() {
        myClick(wishList.addToWishListButton);
    }

    @Then("A confirmation message {string} should be visible")
    public void confirmationMessageShouldBeVisible(String expectedMessage) {
        verifyContainsText(wishList.wishListSuccessMessage, expectedMessage);
    }

    @When("The user removes the product from the wish list")
    public void theUserRemovesProductFromWishList() {
        hoverOver(wishList.productImage);
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(wishList.removeItemButton));

        jsClick(wishList.removeItemButton);
    }

    @Then("A confirmation message after removing {string} should be visible")
    public void removeConfirmationMessageShouldBeVisible(String expectedMessage) {
        verifyContainsText(wishList.removeSuccessMessage, expectedMessage);
    }
}