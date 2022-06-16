package com.test.Likin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(2000);
        for(int i=1;i<=4;i++) {
            WebElement ele=driver.findElement(By.xpath("//p[text()='Check the below points before automating']/following-sibling::div["+i+"]/descendant::input"));
            Thread.sleep(3000);
         Boolean ok = ele.isSelected();

         if(ok.equals(true)){
                 System.out.println("Check box "+i+" is selected");
         }
         else
             System.out.println("check box "+i+" is not selected");
                 }
        Thread.sleep(4000);
        driver.quit();
    }

}
