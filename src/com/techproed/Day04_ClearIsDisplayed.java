package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_ClearIsDisplayed {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        signInLinki.click();

        WebElement emailBox = driver.findElement(By.id("session_email"));
        emailBox.sendKeys("\"testtechproed@gmail.com");
        emailBox.clear();

        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.isDisplayed(); // webelementin görünürlüğünü bulur
        if(signInButonu.isDisplayed()){ //web elementin görünürlüğünü sorgular
            System.out.println("evet görünüyor");
        }else{
            System.out.println("hayır görünmüyor");
        }


    }
}
