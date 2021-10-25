package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {
    private Wallet wallet = new Wallet();

    public DisplayBalanceSteps() {
        Given("There is $100 in my wallet", () -> {
            wallet.deposit(100);
        });

        When("I check the balance of my wallet", () -> {
           wallet.getBalance();
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals("Incorrect wallet balance",100,wallet.getBalance());
        });
    }
}