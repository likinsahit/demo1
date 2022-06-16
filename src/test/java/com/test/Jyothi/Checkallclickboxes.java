package com.test.Jyothi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkallclickboxes {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Seleniummvn\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
        Thread.sleep(1000);

        WebElement element= driver.findElement(By.xpath("//p[text()='Check the below points before automating']/parent::div[1]/descendant::input[1]"));
        element.click();
        boolean select=element.isSelected();
        Thread.sleep(1000);

        WebElement element1=driver.findElement(By.xpath("//p[text()='Check the below points before automating']/parent::div[1]/descendant::input[2]"));
        element1.click();
        boolean select1=element1.isSelected();
        Thread.sleep(1000);

        WebElement element2=driver.findElement(By.xpath("//p[text()='Check the below points before automating']/parent::div[1]/descendant::input[3]"));
        element2.click();
        boolean select2=element2.isSelected();
        Thread.sleep(1000);

        WebElement element3=driver.findElement(By.xpath("//p[text()='Check the below points before automating']/parent::div[1]/descendant::input[4]"));
        element3.click();
        boolean select3=element3.isSelected();
        Thread.sleep(1000);


        if ( select && select1 && select2 && select3){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
