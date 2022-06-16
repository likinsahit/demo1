package com.test.Jyothi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Detailsentry {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Seleniummvn\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/input-form-demo.html");
        Thread.sleep(1000);

        List<WebElement> list = driver.findElements(By.xpath("//input[@class='form-control']"));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAttribute("type").equals("text")) {
                list.get(i).click();
                Thread.sleep(1000);
                list.get(i).isDisplayed();
                System.out.println("Test passed");
            } else {
                System.out.println("Test failed");
            }

        }

        WebElement element = driver.findElement(By.xpath("//select[@class='form-control selectpicker']"));
        element.click();
        boolean select = element.isDisplayed();
        Thread.sleep(1000);


        WebElement element1 = driver.findElement(By.xpath("//input[@value='yes']"));
        element1.click();
        boolean select1 = element1.isSelected();
        Thread.sleep(1000);

        WebElement element2 = driver.findElement(By.xpath("//textarea[@placeholder='Project Description']"));
        element2.click();
        boolean select2 = element2.isDisplayed();
        Thread.sleep(1000);

        WebElement element3 = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        element3.click();
        boolean select3 = element3.isEnabled();
        Thread.sleep(1000);


        if (select && select1 && select2 && select3) {
            System.out.println("test case passed");
        } else {
            System.out.println("test case failed");
        }

        Thread.sleep(1000);
        driver.quit();
    }
}
