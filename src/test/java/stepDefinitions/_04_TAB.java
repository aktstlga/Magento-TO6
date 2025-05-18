package stepDefinitions;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.CartTransactions;
import io.cucumber.java.en.*;
import utilities.GWD;

public class _04_TAB {
    CartTransactions c = new CartTransactions();
    Actions actions=new Actions(GWD.getDriver());

    @When("In the user tab menu, navigate to Women branches")
    public void ınTheUserTabMenuHoverOverWomen() {
        actions.moveToElement(c.women)
                .moveToElement(c.tops)
                .moveToElement(c.tees)
                .click()
                .build()
                .perform();
        c.myClick(c.homepage);
    }

    @When("In the user tab menu, navigate to Men branches")
    public void ınTheUserTabMenuHoverOverMen() {
        actions.moveToElement(c.men)
                .moveToElement(c.tops2)
                .moveToElement(c.jackets)
                .click()
                .build()
                .perform();
        c.myClick(c.homepage);
    }

    @When("In the user tab menu, navigate to Gear")
    public void navigating_tab_menus() {
        actions.moveToElement(c.gear)
                .moveToElement(c.bags)
                .click()
                .build()
                .perform();
        c.myClick(c.homepage);
    }

    @When("In the user tab menu, hover over Training")
    public void ınTheUserTabMenuHoverOverTraining() {
        actions.moveToElement(c.training)
                .moveToElement(c.video)
                .click()
                .build()
                .perform();
        c.myClick(c.homepage);
    }
}
