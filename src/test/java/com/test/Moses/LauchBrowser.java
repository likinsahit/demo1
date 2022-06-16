package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();

    }
}
