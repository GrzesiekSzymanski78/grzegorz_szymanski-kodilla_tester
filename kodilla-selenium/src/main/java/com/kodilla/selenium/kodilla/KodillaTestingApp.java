package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");

        WebElement inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        inputField.sendKeys("grzegorz.szymanski1@bnpparibas.pl");
        inputField = driver.findElement(By.xpath("/html/body/div/div/form/fieldset[2]/input"));
        inputField.sendKeys("haslo");
        WebElement logBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        logBtn.submit();
    }
}