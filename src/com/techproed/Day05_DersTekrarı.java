package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_DersTekrarı {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Toshiba/Documents/selenium depende/Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("computers");

        WebElement clickButton = driver.findElement(By.id("nav-search-submit-button"));
        clickButton.submit();

        WebElement textElement = driver.findElement(By.className("sg-col-inner"));
        System.out.println(textElement.getText());

        if (textElement.isDisplayed()) {
            System.out.println("Shows");

        }else{
            System.out.println("No Shows");
        }




    }
}
