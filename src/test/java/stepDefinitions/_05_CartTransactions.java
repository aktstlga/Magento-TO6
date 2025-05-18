package stepDefinitions;

import io.cucumber.java.en.*;
import pages.CartTransactions;
import utilities.GWD;

public class _05_CartTransactions {
    CartTransactions c = new CartTransactions();

    @And("User should purchase an item from the men's section")
    public void userShouldPurchaseAnItemFromTheMenSSection() {
        c.myClick(c.men);
        c.myClick(c.clothes);
        c.myClick(c.size);
        c.myClick(c.color);
        c.qty.clear();
        c.mySendKeys(c.qty, "2");
        c.myClick(c.addbutton);
        GWD.quitDriver();
    }
}



