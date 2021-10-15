package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    private GoogleResult googleResult;

    @FindBy(css = "input[title='Szukaj']")
    private WebElement inputField;

    @FindBy(css = "input[value='Szukaj w Google']")
    private List<WebElement> buttonList;

    @FindBy(id = "L2AGLb")
    private WebElement consentToCookiesBtn;

    public GoogleSearch(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchResults() {
        consentToCookiesBtn.click();
        inputField.sendKeys("Kodilla");
        googleResult = loadResults();
        googleResult.isSeeResults();
    }

    public GoogleResult loadResults() {
        WebElement searchButton = buttonList.get(1);
        searchButton.click();
        GoogleResult googleResult = new GoogleResult(driver);
        return googleResult;
    }
}