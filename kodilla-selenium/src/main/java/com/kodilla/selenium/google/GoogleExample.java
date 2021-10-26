package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement imputField = driver.findElement(By.name("q"));
        WebElement consentToCookiesBtn = driver.findElement(By.id("L2AGLb"));
        consentToCookiesBtn.click();
        imputField.sendKeys("Kodilla");
        imputField.submit();
    }
}