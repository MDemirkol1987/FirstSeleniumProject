package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();

        if (youtubeTitle.toLowerCase().contains("video")){
            System.out.println(youtubeTitle + "'da video kelimesi geçiyor.");
        }else {
            System.out.println(youtubeTitle + "'da video kelimesi geçmiyor.");
        }
        driver.quit();
    }
}
