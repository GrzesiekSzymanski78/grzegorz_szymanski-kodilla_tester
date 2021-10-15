package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResult extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> results;

    public GoogleResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public void isSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public WebElement getRandomElement() {
        int maxResults = results.size();
        Random random = new Random();
        int randomPage = random.nextInt(maxResults);
        WebElement webElement = results.get(randomPage);
        System.out.println(webElement.getTagName());
        System.out.println(webElement);
        return results.get(randomPage);
    }
}