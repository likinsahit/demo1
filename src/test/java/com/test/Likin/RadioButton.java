package com.test.Likin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-radiobutton-demo.html");
        Thread.sleep(2000);
        String sex="Male";
        String age="15 - 50";
        driver.findElement(By.xpath("//input[@value='"+sex+"' and @name='gender']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='"+age+"']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Get values']")).click();
        Thread.sleep(2000);
        String Info=driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        Thread.sleep(2000);
        System.out.println(Info);
        driver.quit();
    }
}
