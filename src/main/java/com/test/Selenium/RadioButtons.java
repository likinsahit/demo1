package com.test.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-radiobutton-demo.html");
        Thread.sleep(5000);

        //p[text()='Click on button to get the selected value']/following-sibling::label[1]/input
        //p[text()='Click on button to get the selected value']/following-sibling::label[2]/input

        //p[@class='radiobutton']

        WebElement element =  driver.findElement(By.xpath("//p[text()='Click on button to get the selected value']/following-sibling::label[1]/input"));
                                element.click();
                                Thread.sleep(2000);
          boolean   isSelected= element.isSelected();
          driver.findElement(By.xpath("//button[text()='Get Checked value']")).click();

          String str = "Radio button %s is checked";
          String type = "'Male'";
          String finalstr = String.format(str, type) ;
          System.out.println(finalstr);
          String actualstr = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();

          if(actualstr.equals(finalstr) && isSelected ){

              System.out.println("Test Case is Passed...!!!");
          }else{

              System.out.println("Test Case is Failed...!!!");
          }
        Thread.sleep(5000);
        driver.quit();
    }
}
