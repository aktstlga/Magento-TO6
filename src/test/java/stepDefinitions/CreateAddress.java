package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.datafaker.Faker;
import org.openqa.selenium.By;
import pages.CreateAddressPOM;
import utilities.GWD;
import utilities.ReusableMethods;

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
        reusableMethods.myClick(createAddress.addressBookButton);
        reusableMethods.verifyUrlContains("address");
    }

    @When("The user fills in the new address form with:")
    public void the_user_fills_in_the_new_address_form_with(DataTable company, DataTable phoneNumber, DataTable street, DataTable city, DataTable state, DataTable zipCode, DataTable country) {

    }

    @When("The user saves the address")
    public void the_user_saves_the_address() {
        System.out.println("asd");

    }
}
