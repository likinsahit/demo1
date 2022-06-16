package com.test.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/javascript-alert-box-demo.html");
        Thread.sleep(5000);

        // driver.navigate.farward();
        // driver.navigate.back();
        // driver.navigate.refresh();
        // driver.navigate.to();

        driver.navigate().to("https://demo.anhtester.com/input-form-demo.html");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();

        Thread.sleep(5000);
        driver.quit();

    }
}
