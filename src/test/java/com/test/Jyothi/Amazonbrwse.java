package com.test.Jyothi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Amazonbrwse {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Seleniummvn\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("apple");
        Thread.sleep(1000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));


        for (int i = 0; i < list.size(); i++) {

            Thread.sleep(1000);
            if (list.get(i).getAttribute("aria-label").equals("apple cider vinegar")) {
                list.get(i).click();
                break;

            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}