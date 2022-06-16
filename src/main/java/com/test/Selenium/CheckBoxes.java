package com.test.Selenium;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
        Thread.sleep(5000);


        String attrtexxt =   driver.findElement(By.xpath("//div[@id='txtAge']")).getAttribute("id");
        boolean isSelected = driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();

        Thread.sleep(2000);
        String texxt =   driver.findElement(By.xpath("//div[@id='txtAge']")).getText();

      if(texxt.equals("Success - Check box is checked") && isSelected){
          System.out.println("Test Case is Passed...!!!");
      }else{

          System.out.println("Test Case is Failed...!!!");
      }

      System.out.println(attrtexxt);

        Thread.sleep(5000);
        driver.quit();
    }
}
