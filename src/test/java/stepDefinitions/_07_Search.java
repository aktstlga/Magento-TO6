package stepDefinitions;

import pages.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.GWD;
import utilities.ReusableMethods;

public class _07_Search extends ReusableMethods {

    Search search = new Search();

    @Given("The user is on the home page")
    public void theUserIsOnTheHomePage() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("The user enters SKU {string} into the search box and presses Enter")
    public void theUserEntersSKUIntoTheSearchBoxAndPressesEnter(String sku) {
        mySendKeys(search.searchInput, sku);
        search.searchInput.submit();
    }

    @Then("The product named {string} should be displayed in the search results")
    public void theProductNamedShouldBeDisplayedInTheSearchResults(String expectedProductName) {
        verifyContainsText(search.searchResultItem, expectedProductName);
    }

    @And("The user clicks on the product")
    public void theUserClicksOnTheProduct() {
        myClick(search.searchResultItem);
    }

    @Then("The product detail page should display SKU as {string}")
    public void theProductDetailPageShouldDisplaySKUAs(String expectedSKU) {
        verifyEqualsText(search.productSKU, expectedSKU);
    }

    @Then("A message {string} should be displayed")
    public void aMessageShouldBeDisplayed(String expectedMessage) {
        verifyEqualsText(search.noResultWarning, expectedMessage);
    }
}