package stepDefinitions;

import io.cucumber.java.en.*;
import net.datafaker.Faker;
import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CreateAddressPOM;
import utilities.GWD;
import utilities.ReusableMethods;

import java.util.List;

public class CreateAddress {
    ReusableMethods reusableMethods = new ReusableMethods();
    CreateAddressPOM createAddress = new CreateAddressPOM();
    Faker faker = new Faker();

    @Given("The user logs")
    public void the_user_logs_in() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
        GWD.getDriver().findElement(By.id("email")).sendKeys("deneme123321@gmail.com");
        GWD.getDriver().findElement(By.id("pass")).sendKeys("TOLgadeneme123321");
        GWD.getDriver().findElement(By.id("send2")).click();
    }

    @Given("The user navigates to the My Account section")
    public void the_user_navigates_to_the_my_account_section() {
        reusableMethods.verifyUrlContains("account");
    }

    @Given("The user opens the address section")
    public void the_user_opens_the_address_section() {
        List<WebElement> stateField = GWD.getDriver().findElements(By.linkText(""));
        reusableMethods.myClick(createAddress.addressBookButton);
        reusableMethods.verifyUrlContains("address");
    }

    @When("The user saves the address")
    public void the_user_saves_the_address() {
        reusableMethods.myClick(createAddress.saveAddressButton);
        reusableMethods.verifyUrlContains("index");
        reusableMethods.verifyContainsText(createAddress.successText,"saved the address");
    }

    @When("The user fills in the company, phone number, and street fields with {string}, {string}, and {string}")
    public void theUserFillsInTheCompanyPhoneNumberAndStreetFieldsWithAnd(String arg0, String arg1, String arg2) {
        reusableMethods.mySendKeys(createAddress.companyNamePlaceholder, arg0);
        reusableMethods.mySendKeys(createAddress.telephoneNumberPlaceholder, arg1);
        reusableMethods.mySendKeys(createAddress.streetAddressOne, arg2);
    }

    @And("The user selects {string} as country, which enables selection of {string}, {string}, and {string}")
    public void theUserSelectsAsCountryWhichEnablesSelectionOfAnd(String countryName, String city, String state, String zipCode) {
        reusableMethods.myClick(createAddress.selectCountry);
        reusableMethods.mySelect(createAddress.selectCountry, countryName);
        reusableMethods.myClick(createAddress.selectCountry);

        reusableMethods.mySendKeys(createAddress.zipCode, zipCode);
        reusableMethods.mySendKeys(createAddress.cityNamePlaceholder, city);

        List<WebElement> stateField = GWD.getDriver().findElements(By.cssSelector("div[class='field region required']"));

        if (stateField.isEmpty()) {
            reusableMethods.mySendKeys(createAddress.stateSendKeys, state);

        } else {
            reusableMethods.myClick(createAddress.selectState);
            reusableMethods.mySelect(createAddress.selectState, state);
            reusableMethods.myClick(createAddress.selectState);
        }
    }
}