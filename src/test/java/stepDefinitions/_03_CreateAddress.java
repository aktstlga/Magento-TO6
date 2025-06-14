package stepDefinitions;

import io.cucumber.java.en.*;
import net.datafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.List;

public class _03_CreateAddress {
    ReusableMethods reusableMethods = new ReusableMethods();
    pages.CreateAddress createAddress = new pages.CreateAddress();

    @Given("The user navigates to the My Account section")
    public void the_user_navigates_to_the_my_account_section() {
        reusableMethods.myClick(createAddress.myAccountButton);
        reusableMethods.myClick(createAddress.myAccountNavigationButton);
        reusableMethods.verifyUrlContains("account");
    }

    @Given("The user opens the address section")
    public void the_user_opens_the_address_section() {
        reusableMethods.myClick(createAddress.addressBookButton);
        reusableMethods.verifyUrlContains("address");
        List<WebElement> addAddressButton = GWD.getDriver().findElements(By.cssSelector("button[title='Add New Address']"));

        if (!addAddressButton.isEmpty()) {
            reusableMethods.myClick(createAddress.addAddressButton);
        }
    }

    @When("The user fills in the company, phone number, and street fields with {string}, {string}, and {string}")
    public void theUserFillsInTheCompanyPhoneNumberAndStreetFieldsWithAnd(String company, String phoneNumber, String street) {
        reusableMethods.mySendKeys(createAddress.companyNamePlaceholder, company);
        reusableMethods.mySendKeys(createAddress.telephoneNumberPlaceholder, phoneNumber);
        reusableMethods.mySendKeys(createAddress.streetAddressOne, street);
    }

    @And("The user selects {string} as country, which enables selection of {string}, {string}, and {string}")
    public void theUserSelectsAsCountryWhichEnablesSelectionOfAnd(String countryName, String city, String state, String zipCode) {
        reusableMethods.mySelect(createAddress.selectCountry, countryName);
        reusableMethods.mySendKeys(createAddress.zipCode, zipCode);
        reusableMethods.mySendKeys(createAddress.cityNamePlaceholder, city);

        List<WebElement> stateField = GWD.getDriver().findElements(By.cssSelector("div[class='field region required']"));
        if (stateField.isEmpty()) {
            reusableMethods.mySendKeys(createAddress.stateSendKeys, state);

        } else {
            reusableMethods.mySelect(createAddress.selectState, state);
        }
        reusableMethods.Wait(6);
        reusableMethods.myClick(createAddress.saveAddressButton);
    }

    @When("The user saves the address")
    public void the_user_saves_the_address() {
        reusableMethods.verifyUrlContains("index");
        reusableMethods.verifyContainsText(createAddress.successText, "saved");
        GWD.quitDriver();
    }
}