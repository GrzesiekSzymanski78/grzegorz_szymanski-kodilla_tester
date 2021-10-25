package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class AllCashWithdrawalSteps implements En {
    private CashSlot cashSlot = new CashSlot();
    private Wallet wallet = new Wallet();

    public AllCashWithdrawalSteps() {
        Given("In my wallet i have $200", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,200);
        });

        Then("$200 should be dispensed",() -> {
            cashSlot.dispense(200);
            Assert.assertEquals("Incorrect dispense",200,cashSlot.getContents());
        });

        Then("The balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance",0,wallet.getBalance());
        });
    }
}