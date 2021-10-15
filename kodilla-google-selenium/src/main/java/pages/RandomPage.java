package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RandomPage extends AbstractPage {

    @FindBy(css = "div[class='g']")
    static WebElement webElement;
    private final GoogleSearch googleSearch = new GoogleSearch(driver);

    public RandomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public WebElement clickInRandomPage(WebElement googleSearch) {
        webElement = googleSearch;
        webElement.click();
        return webElement;
    }
}