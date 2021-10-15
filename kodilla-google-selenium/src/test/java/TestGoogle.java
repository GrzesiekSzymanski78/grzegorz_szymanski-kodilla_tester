import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResult;
import pages.GoogleSearch;
import pages.RandomPage;

public class TestGoogle {

    WebDriver driver = new ChromeDriver();
    private final GoogleSearch googleSearch = new GoogleSearch(driver);
    private final GoogleResult googleResult = new GoogleResult(driver);
    private final RandomPage randomPage = new RandomPage(driver);

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        googleSearch.searchResults();
    }

    @Test
    public void testRandomResult() {
        googleSearch.searchResults();
        googleResult.getRandomElement().click();
    }

    @Test
    public void wasCorrectOpenSearchResultClicked() {
        googleSearch.searchResults();
        googleResult.getRandomElement();
        WebElement webElement = googleResult.getRandomElement();
        WebElement webElement1 = randomPage.clickInRandomPage(webElement);
        Assert.assertSame(webElement, webElement1);
    }
}