package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventOverdrawnSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public PreventOverdrawnSteps() {
        Given("My wallet has been credited $200", () -> {
            wallet.deposit(200);
            Assert.assertEquals(200, wallet.getBalance());
        });

        When("I request $201", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 201);
        });

        Then("Nothing should be dispensed", () -> {
            Assert.assertEquals(200, wallet.getBalance());
        });
        Then("I should be told that I have insufficient funds in my account", () -> {
            Cashier cashier = new Cashier(cashSlot);
            Assert.assertEquals("Sorry, you have insufficient funds in your wallet",cashier.getMessage());
        });
    }
}