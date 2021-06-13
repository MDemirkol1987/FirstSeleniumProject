package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();

        if (amazonTitle.contains("computer")){
            System.out.println(amazonTitle + "'da computer kelimesi geçiyor.");
        }else {
            System.out.println(amazonTitle + "'da computer kelimesi geçmiyor.");
        }
        driver.quit();

    }
}
