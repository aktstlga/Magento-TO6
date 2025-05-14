package stepDefinitions;

import pages.Register;
import utilities.ConfigReader;
import utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.datafaker.Faker;
import org.testng.Assert;

public class _01_Register {
    Register register = new Register();
    Faker dataFaker = new Faker();

    @Given("Navigate to Magento")
    public void navigate_to_campus() {
        GWD.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @And("Navigate to Create an Account Site")
    public void navigateToCreateAnAccountSite() {
        register.myClick(register.account);
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("account/create"), "Siteye geçiş yapılamadı.");
    }

    @When("Enter Signing Up Informations and click on Create an Account button")
    public void enterSigningUpInformationsAndClickOnCreateAnAccountButton() {
        register.mySendKeys(register.firstName, dataFaker.name().firstName());
        register.mySendKeys(register.lastName, dataFaker.name().lastName());

        ConfigReader.updateProperty("email");
        ConfigReader.updateProperty("password");
        register.mySendKeys(register.eMail, ConfigReader.getProperty("email"));
        register.mySendKeys(register.password, ConfigReader.getProperty("password"));
        register.mySendKeys(register.confingPassword, ConfigReader.getProperty("password"));
        register.myClick(register.accountButton);

        GWD.quitDriver();


    }
}
