package com.test.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Welcome TO Selenium Tutorial");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        String str = driver.findElement(By.xpath("//span[@id='display']")).getText();

        if(str.equals("Welcome TO Selenium Tutorial")){
            System.out.println("The Test Case is Passed.....!!!!");
        }else{

            System.out.println("The Test Case is Failed.....!!!!");
        }
        Thread.sleep(5000);
        driver.quit();

    }
}
