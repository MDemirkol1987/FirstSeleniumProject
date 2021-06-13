package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Alistirma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://google.com");
        WebElement googleText = driver.findElement(By.name("q"));
        googleText.sendKeys("city bike");

        WebElement googleAra = driver.findElement(By.name("btnK"));
        googleAra.submit();

        WebElement resultNumber = driver.findElement(By.id("result-stats"));
        System.out.println(resultNumber.getText());

        WebElement shopping = driver.findElement(By.className("hide-focus-ring"));
        shopping.click();

    }
}
