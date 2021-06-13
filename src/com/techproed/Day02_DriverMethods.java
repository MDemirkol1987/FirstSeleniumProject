package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        driver.navigate().to("https://galatasaray.org");

        String galatasarayTitle = driver.getTitle();
        System.out.println("Galatasaray Title: " + galatasarayTitle);

        String galatasarayUrl = driver.getCurrentUrl();
        System.out.println("Galatasaray URL:" + galatasarayUrl);

        driver.quit();
    }
}
