package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com"); // We specified which address we will go to.
        //driver.get("https://amazon.com");
        //driver.close(); // we can closed which open page
        driver.quit();  // we can closed all pages in chrome

    }
}
