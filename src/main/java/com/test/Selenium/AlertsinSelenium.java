package com.test.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsinSelenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/javascript-alert-box-demo.html");
        Thread.sleep(5000);

        // driver.switchto.alert.accept();  --> OK
        // driver.switchto.alert.dismiss();  --> Cancel
        // driver.switchto.alert.getText();  --> Get text in Alert
        //  driver.switchto.alert.SendKeys();  --> Enter Text in Alert


        //Firtst Alert Box
        driver.findElement(By.xpath("//p[text()='Click the button to display an alert box:']/following-sibling::button")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        // Second Alert
        driver.findElement(By.xpath("//b[text()='Click the button to display an confirm box:']/following-sibling::button")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

        // Third ALert Box
        driver.findElement(By.xpath("//b[text()='Click below button for prompt box.']/following-sibling::button")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Hello Alert Box");
        driver.switchTo().alert().accept();

        // No Alert
        Thread.sleep(2000);
        driver.switchTo().alert().accept();


        Thread.sleep(5000);
        driver.quit();

    }
}
