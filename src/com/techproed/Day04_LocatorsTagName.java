package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsTagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        WebElement homeButton = driver.findElement(By.tagName("a"));
        homeButton.click();
        String homeButtonText = homeButton.getText();
        System.out.println(homeButtonText);
    }
}
