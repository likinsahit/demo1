package com.test.Likin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoInputFields {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        int a=10;
        int b=20;
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys(""+a);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys(""+b);
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
       String sum= driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
       int c=a+b;
       int k= Integer.valueOf(sum);
       if(k==c){
           System.out.println("Summation of "+c+" correct");
       }
       else {
           System.out.println("Summation of "+c+"  wrong");
       }
       driver.quit();
   }

}
