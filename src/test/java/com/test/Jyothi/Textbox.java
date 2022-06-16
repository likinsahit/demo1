package com.test.Jyothi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Seleniummvn\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Enter a']/parent::div[1]/descendant::input"))
                .sendKeys("20");
        driver.findElement(By.xpath("//label[text()='Enter b']/parent::div[1]/descendant::input"))
                .sendKeys("30");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

        String str =driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        String finalstr= String.valueOf(Integer.valueOf(str));


        if (finalstr.equals(" Total a + b = ")){
            System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
