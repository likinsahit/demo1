package com.test.BhavaniSankar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nsbsa\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath(" //input[@value='Check All']"));
                            element.click();

        String str = element.getAttribute("value");

        if(str.equals("Uncheck All")){
            System.out.println("all boxes are checked");
        }
        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.xpath(" //input[@value='Uncheck All']"));
                            element1.click();

        String str1 = element1.getAttribute("value");

        if(str1.equals("Check All")){
            System.out.println("all boxes are unchecked");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}


