package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static void main(String[] args) throws NoSuchFrameException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://facebook.com");
        driver.manage().window().maximize();

        WebElement cookieAcceptBtn = driver.findElement
                (By.cssSelector("[data-testid='cookie-policy-dialog-accept-button']"));
        cookieAcceptBtn.click();
        WebElement openRegistrationBtn = driver.findElement
                (By.cssSelector("[data-testid='open-registration-form-button']"));
        openRegistrationBtn.click();
        WebElement yearCombo = driver.findElement(By.xpath
                ("//*[@id=\\\"birthday_wrapper\\\"]/div/span/span/select[3]"));
        yearCombo.sendKeys("Stefek");
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);

        driver.close();
    }
}