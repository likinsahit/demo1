package com.test.Moses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class Amazonsearch {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moses\\OneDrive\\Desktop\\my automatiom testing training\\jars\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.in/");

        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
                             element.sendKeys("apple");

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/child::div/descendant::span"));
        String str = "apple";
        for(int i=0;i< list.size();i++){
            if(list.get(i).getText().contains(str+" watch")) {

                list.get(i).click();
                break;
            }
            }
        }





}
