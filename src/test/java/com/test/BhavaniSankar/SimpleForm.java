package com.test.BhavaniSankar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForm {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\nsbsa\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-first-form-demo.html");
        Thread.sleep(3000);

        driver.findElement(By.xpath(" //a[@title = 'Close']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(" //input[@id='sum1']")).sendKeys("4646536");
        driver.findElement(By.xpath(" //input[@id='sum2']")).sendKeys("812651");
        driver.findElement(By.xpath(" //button[text()='Get Total']")).click();
        String str = driver.findElement(By.xpath(" //span[@id='displayvalue']")).getText();

        int sum = Integer.parseInt(str);

        if(sum==sum){

            System.out.println("The test case is passed");
        }else{
            System.out.println("The test case is failed");
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
