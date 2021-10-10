package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) throws RuntimeException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.manage().window().maximize();

        WebElement acceptBtn = driver.findElement(By.cssSelector("button[data-role=accept-consent"));
        acceptBtn.click();
        WebElement categoryElectronic = driver.findElement(By.linkText("Elektronika"));
        categoryElectronic.click();
        WebElement inputField = driver.findElement(By.cssSelector("input[data-role=search-input]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> elements = driver.findElements(By.cssSelector("[data-item=true]"));
        System.out.println(elements.size());
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }
        driver.quit();
    }
}