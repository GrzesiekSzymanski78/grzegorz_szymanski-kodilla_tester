package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");
        driver.manage().window().maximize();

        WebElement acceptBtn = driver.findElement(By.xpath("//*[@data-role='accept-consent']"));
        acceptBtn.click();
        WebElement categoryElectronic = driver.findElement(By.xpath("//*[@label='Kategorie']//child::option[3]"));
        categoryElectronic.click();
        WebElement inputField = driver.findElement(By.xpath("(//*[@data-role='search-form']//following::input)[1]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        driver.quit();
    }
}