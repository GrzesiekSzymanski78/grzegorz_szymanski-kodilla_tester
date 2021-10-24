package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsDivisibleSteps implements En {
    private int number;
    private String answer;

    public IsDivisibleSteps() {
        Given("There is a 3", () -> {
            this.number = 3;
        });

        Given("There is a 5", () -> {
            this.number = 5;
        });

        Given("There is a 6", () -> {
            this.number = 6;
        });

        Given("There is a 7", () -> {
            this.number = 7;
        });

        Given("There is a 9", () -> {
            this.number = 9;
        });

        Given("There is a 10", () -> {
            this.number = 10;
        });

        Given("There is a 15", () -> {
            this.number = 15;
        });

        Given("There is a 18", () -> {
            this.number = 18;
        });

        Given("There is a 30", () -> {
            this.number = 30;
        });

        Given("There is a 31", () -> {
            this.number = 31;
        });

        Given("There is a 40", () -> {
            this.number = 40;
        });

        Given("There is a 45", () -> {
            this.number = 45;
        });

        When("Check weather number is divisible by three, five or by three and five",() -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDisplay(this.number);
        });

        Then("I should receive {string}", (String string) -> {
            Assert.assertEquals(string,this.answer);
        });
    }
}