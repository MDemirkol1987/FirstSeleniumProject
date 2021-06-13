package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_IfElseTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println(youtubeTitle);
        if (youtubeTitle.toLowerCase().equals("youtube")) {
            System.out.println("Sayfanın Başlığı "+youtubeTitle);
        }else{
            System.out.println("Sayfanın başlığı Youtube değil");
        }
        String youtubeUrl= driver.getCurrentUrl();
        System.out.println(youtubeUrl);
        if (youtubeUrl.toLowerCase().contains("youtube")) {
            System.out.println("Youtube URL: " + youtubeUrl);

        }else{
            System.out.println(youtubeUrl);
        }
        driver.get("http://amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();



        String amazonUrl= driver.getCurrentUrl();
        System.out.println(amazonUrl);
        if (amazonUrl.toLowerCase().contains("amazon")) {
            System.out.println("amazon içeriyor");

        }else{
            System.out.println(amazonUrl);
        }
        String amazonTitle = driver.getTitle();
        System.out.println(amazonTitle);
        if (amazonTitle.toLowerCase().equals("amazon")) {
            System.out.println("Sayfanın Başlığı"+amazonTitle);
        }else{
            System.out.println("Sayfanın başlığı amazon değil");
        }
        driver.quit();
    }
}
