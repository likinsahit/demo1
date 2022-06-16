package com.test.Selenium;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlertPresent {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/javascript-alert-box-demo.html");
        Thread.sleep(5000);

         System.out.println(isAlertPresent(driver));

        Thread.sleep(5000);
        driver.quit();
    }



    public static boolean isAlertPresent(WebDriver  driver){

        try {

            driver.switchTo().alert();
            return  true;

        }catch (NoAlertPresentException e){
            return  false;

        }


    }
}
