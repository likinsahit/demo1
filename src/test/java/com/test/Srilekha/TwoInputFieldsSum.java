package com.test.Srilekha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoInputFieldsSum {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Launch Easy Selenium URL
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Close']")).click();
        Thread.sleep(2000);

        //Text Boxes Example
        //Enter Value for a
        // Enter Value for b
        //Total a + b =

        int a = 10;
        int b = 20;

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys(""+a);
//        ele.sendKeys(" 10");
//        ele.click();
//        ele.getText();
//        int abc = Integer.parseInt(ele.getText());


        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys(""+b);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

        Thread.sleep(2000);
        String getTotal = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

        Thread.sleep(2000);
        System.out.println("Get total is : " + getTotal);

          int sum = a+b;
        String  sum1 = String.valueOf(sum);

        if(sum1.equals(getTotal)){
            System.out.println("Test Case is Passes!...");
        } else{
            System.out.println("Test Case is Failed!...");
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
