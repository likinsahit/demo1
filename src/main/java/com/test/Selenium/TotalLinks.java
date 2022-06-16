package com.test.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TotalLinks {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-radiobutton-demo.html");
        Thread.sleep(5000);

        List<WebElement> list = driver.findElements(By.xpath("//a"));

        System.out.println("The Total No Of Links PResent in a Web Page are: " + list.size());

        for(int i=0; i<list.size(); i++){

            System.out.println(list.get(i).getAttribute("href"));
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
