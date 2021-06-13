package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://youtube.com");

        String youtubeTitle = driver.getTitle();
        System.out.println("Youtube Title: " + youtubeTitle);

        String youtubeUrl = driver.getCurrentUrl();
        System.out.println("Youtube URL:" + youtubeUrl);

        driver.navigate().back();
        String googleUrl= driver.getCurrentUrl();
        System.out.println("Google URL:" + googleUrl);

        driver.quit();
    }
}
