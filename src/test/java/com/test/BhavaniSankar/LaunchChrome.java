package com.test.BhavaniSankar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\nsbsa\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        Thread.sleep(5000);


        //a[@title = 'Close']
        driver.findElement(By.xpath(" //a[@title = 'Close']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
