package com.test.Likin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmaznDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple");
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/descendant::div[@role='button']"));
        Thread.sleep(1000);
        System.out.println("The size of list " + list.size());
        Thread.sleep(2000);
        String watch="apple watch";
        for (int i = 0; i < list.size(); i++) {
            String k=list.get(i).getText();
            if(k.equals(watch)){
                list.get(i).click();
                break;
            }
        }
        Thread.sleep(7000);
        driver.quit();

    }
}
