package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigationMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // we can do full screen the page

        driver.get("https://google.com");
        driver.navigate().to("https://amazon.com"); //we can open website like get method
        driver.navigate().back(); // we can go back in website
        driver.navigate().forward(); // we can go forward website
        driver.navigate().refresh(); // we can refresh website
        driver.close();
    }
}
