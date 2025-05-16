package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPOM;
import utilities.ConfigReader;
import utilities.GWD;
import utilities.ReusableMethods;

public class _02_Login {
    ReusableMethods reusableMethods = new ReusableMethods();
    LoginPOM loginElements = new LoginPOM();

    @Given("Navigate to Magento and Login Page")
    public void navigate_to_magento_and_login_page() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        reusableMethods.myClick(loginElements.signInButtonOnMainPage);

        reusableMethods.verifyUrlContains("account");
    }

    @When("Enter E-mail and and password and click on the login button")
    public void enter_e_mail_and_and_password_and_click_on_the_login_button() {
        reusableMethods.mySendKeys(loginElements.emailPlaceholder, ConfigReader.getProperty("email"));
        reusableMethods.mySendKeys(loginElements.passwordPlaceholder, ConfigReader.getProperty("password"));
        reusableMethods.myClick(loginElements.loginClickButton);
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        reusableMethods.verifyContainsText(loginElements.signInButtonOnMainPage, "Sign");
    }
}
