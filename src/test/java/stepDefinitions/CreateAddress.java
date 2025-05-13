package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import utilities.GWD;
import utilities.ReusableMethods;

public class CreateAddress {
    ReusableMethods reusableMethods = new ReusableMethods();

    @Given("The user logs in")
    public void the_user_logs_in() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
        GWD.getDriver().findElement(By.id("email")).sendKeys("deneme123321@gmail.com");
        GWD.getDriver().findElement(By.id("pass")).sendKeys("TOLgadeneme123321");
        GWD.getDriver().findElement(By.id("send2")).click();
    }

    @Given("The user navigates to the My Account section")
    public void the_user_navigates_to_the_my_account_section() {

    }
    @Given("The user opens the address section")
    public void the_user_opens_the_address_section() {

    }
    @When("The user fills in the new address form with:")
    public void the_user_fills_in_the_new_address_form_with(io.cucumber.datatable.DataTable dataTable) {
    }
    @When("The user saves the address")
    public void the_user_saves_the_address() {

    }
}
