import io.github.bonigarcia.wdm.WebDriverManager;
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

    WebDriver driver;
    private GoogleSearch googleSearch;
    private GoogleResult googleResult;
    private RandomPage randomPage;

   @Before
    public void testSetup() {
        WebDriverManager.chromedriver().ignoreVersions("95", "93");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.pl");
        googleSearch = new GoogleSearch(driver);
        googleResult = new GoogleResult(driver);
        randomPage = new RandomPage(driver);
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