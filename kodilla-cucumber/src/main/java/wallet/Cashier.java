package wallet;

public class Cashier {
    private CashSlot cashSlot;
    private String message = "Sorry, you have insufficient funds in your wallet";

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= wallet.getBalance()) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else {
            System.out.println(message);
        }
    }

    public String getMessage() {
        return message;
    }
}