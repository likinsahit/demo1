package com.test.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/window-popup-modal-demo.html");
        Thread.sleep(5000);

        String parentWindow  = driver.getWindowHandle();
        System.out.println("Parent Window Is is: "+ parentWindow);

        driver.findElement(By.xpath("//a[text()=' Follow On Twitter ']")).click();

        Set<String>  allWindows = driver.getWindowHandles();


        Iterator<String> itr = allWindows.iterator();

        while (itr.hasNext()){

            String childWindow = itr.next();
           if(!parentWindow.equals(childWindow)) {
               driver.switchTo().window(childWindow);
               System.out.println(driver.getTitle());
               driver.close();
           }

        }

        driver.switchTo().window(parentWindow);

        Thread.sleep(5000);
        driver.quit();

    }
}
