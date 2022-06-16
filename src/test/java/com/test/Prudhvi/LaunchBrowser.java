package com.test.Prudhvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","C:\\Users\\prudh\\Desktop\\Selenium Auto Training\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id=\"at-cv-lightbox-close\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id=\"user-message\"]")).sendKeys("Welcome to Selenium Tutorial");
        driver.findElement(By.xpath("  //button[text() =\"Show Message\"]")).click();
        Thread.sleep(5000);
        String str = driver.findElement(By.xpath("//span[@id=\"display\"]")).getText();

        if (str.equals("Welcome to Selenium Tutorial"))
        {
            System.out.println("The test case is passed");
        }
        else
        {
            System.out.println(" The test case is failed");
        }

        driver.quit();
    }
}
