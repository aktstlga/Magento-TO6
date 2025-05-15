package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import pages.CartTransactions;

import java.util.List;
import java.util.Random;

public class _05_CartTransactions {
    CartTransactions c = new CartTransactions();
    Random random = new Random();

    @When("User logged in with valid credentials")
    public void userLoggedInWithValidCredentials() {
        c.myClick(c.singın);
        c.mySendKeys(c.email, ("geyat20709@boyaga.com"));
        c.mySendKeys(c.password, ("team6test."));
        c.myClick(c.sıgnınbutton);
    }

    @And("User should purchase an item from the men's section")
    public void userShouldPurchaseAnItemFromTheMenSSection() {
        c.myClick(c.men);
        c.myClick(c.clothes);
        c.myClick(c.size);
        c.myClick(c.color);
        c.qty.clear();
        c.mySendKeys(c.qty,"2");
        c.myClick(c.addbutton);
    }
}



