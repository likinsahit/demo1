package com.test.Jyothi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowserlaunch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Seleniummvn\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);


        driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("Shoes");
        Thread.sleep(3000);
        driver.quit();
    }
}
